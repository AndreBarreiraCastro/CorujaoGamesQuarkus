package org.acme.resouce;

import java.io.InputStream;
import java.util.Map;

import org.acme.service.MinioService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.minio.GetObjectArgs;
import io.minio.GetObjectResponse;
import io.minio.MinioClient;
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

    @Inject
    MinioClient minio;

    @ConfigProperty(name = "minio.bucket.default")
    String defaultBucket;

    // DTO para multipart
    public static class UploadForm {
        @FormParam("file")
        public InputStream file;

        @FormParam("contentType")
        public String contentType;
    }

    // Upload ---------------------------------------------
    @POST
    @Path("/upload-image")
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_JSON)
    public Response uploadImage(
            @HeaderParam("Content-Type") String contentType,
            InputStream fileStream) {
        try {

            // Se o client não mandar o tipo, detecta pela extensão

            String nome = new String();
            nome = minioService.upload(fileStream, contentType);

            return Response.ok(Map.of(
                    "object", nome,
                    "content-type", contentType)).build();

        } catch (Exception e) {
            return Response.status(500).entity(Map.of("error", e.getMessage())).build();
        }
    }

    // Download ---------------------------------------------
    @GET
    @Path("/image/{objectName}")
    public Response downloadImage(@PathParam("objectName") String objectName) {
        try {

            // Buscar o objeto no MinIO
            GetObjectResponse object = minio.getObject(
                    GetObjectArgs.builder()
                            .bucket("meu-bucket")
                            .object(objectName)
                            .build());

            // Pegando o tipo correto salvo durante o upload
            String contentType = object.headers().get("Content-Type");

            return Response.ok(object) // <-- GetObjectResponse já é InputStream
                    .type(contentType != null ? contentType : MediaType.APPLICATION_OCTET_STREAM)
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
