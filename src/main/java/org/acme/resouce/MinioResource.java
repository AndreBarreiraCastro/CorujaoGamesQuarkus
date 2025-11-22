package org.acme.resouce;

import java.io.InputStream;
import java.util.Map;

import org.acme.service.MinioService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/files")
public class MinioResource {

    @Inject
    MinioService minioService;

    @ConfigProperty(name = "minio.bucket.default")
    String defaultBucket;

    // DTO para multipart
    public static class UploadForm {
        @FormParam("file")
        public InputStream file;

        @FormParam("objectName")
        public String objectName;

        @FormParam("contentType")
        public String contentType;
    }

    // Upload ---------------------------------------------
@POST
@Path("/upload-image")
@Consumes(MediaType.APPLICATION_OCTET_STREAM)
@Produces(MediaType.APPLICATION_JSON)
public Response uploadImage(
        @QueryParam("objectName") String objectName,
        @HeaderParam("Content-Type") String contentType,
        InputStream fileStream
) {
    try {
        if (objectName == null || objectName.isBlank()) {
            return Response.status(400)
                    .entity(Map.of("error", "objectName é obrigatório"))
                    .build();
        }

        // Se o client não mandar o tipo, detecta pela extensão
        if (contentType == null || contentType.isBlank() || contentType.equals(MediaType.APPLICATION_OCTET_STREAM)) {
            if (objectName.toLowerCase().endsWith(".png")) {
                contentType = "image/png";
            } else if (objectName.toLowerCase().endsWith(".jpg") ||
                       objectName.toLowerCase().endsWith(".jpeg")) {
                contentType = "image/jpeg";
            } else {
                contentType = MediaType.APPLICATION_OCTET_STREAM; // fallback
            }
        }

        minioService.upload(defaultBucket, objectName, fileStream, contentType);

        return Response.ok(Map.of(
                "object", objectName,
                "contentType", contentType
        )).build();

      } catch (Exception e) {
        return Response.status(500).entity(Map.of("error", e.getMessage())).build();
    }
}

    // Download ---------------------------------------------
    @GET
@Path("/image/{objectName}")
public Response downloadImage(@PathParam("objectName") String objectName) {
    try {
        InputStream is = minioService.download(defaultBucket, objectName);

        String contentType;
        if (objectName.toLowerCase().endsWith(".png")) {
            contentType = "image/png";
        } else if (objectName.toLowerCase().endsWith(".jpg") ||
                   objectName.toLowerCase().endsWith(".jpeg")) {
            contentType = "image/jpeg";
        } else {
            contentType = MediaType.APPLICATION_OCTET_STREAM;
        }

        return Response.ok(is)
                .type(contentType)
                .header("Content-Disposition", "inline; filename=\"" + objectName + "\"")
                .build();

    } catch (Exception e) {
        return Response.status(404).entity(Map.of("error", e.getMessage())).build();
    }
}


    // Delete ----------------------------------------------
    @DELETE
    @Path("/{fileName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("fileName") String fileName) {

        try {
            minioService.delete(defaultBucket, fileName);
            return Response.ok(Map.of("deleted", fileName)).build();

        } catch (Exception e) {
            return Response.status(500).entity(Map.of("error", e.getMessage())).build();
        }
    }

    // Presigned URL ---------------------------------------
    @GET
    @Path("/presigned/{fileName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response presigned(@PathParam("fileName") String fileName,
            @QueryParam("expiry") @DefaultValue("3600") int expiry) {

        try {
            String url = minioService.presignedGetUrl(defaultBucket, fileName, expiry);
            return Response.ok(Map.of("url", url)).build();

        } catch (Exception e) {
            return Response.status(500).entity(Map.of("error", e.getMessage())).build();
        }
    }
}
