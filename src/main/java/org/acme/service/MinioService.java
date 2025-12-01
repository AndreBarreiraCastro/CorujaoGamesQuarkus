package org.acme.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import io.minio.GetObjectArgs;
import io.minio.GetObjectResponse;
import io.minio.GetPresignedObjectUrlArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import io.minio.RemoveObjectArgs;
import io.minio.http.Method;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MinioService {

    @Inject
    MinioClient minioClient;

public String upload(InputStream data, String contentType) throws Exception {

    // Ler bytes do stream
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    data.transferTo(buffer);
    byte[] bytes = buffer.toByteArray();
    ByteArrayInputStream finalStream = new ByteArrayInputStream(bytes);

    // Sempre usar .jpeg
    String extension = ".jpeg";

    // E garantir que o Content-Type seja image/jpeg
    contentType = "image/jpeg";

    // Nome final
    String uniqueName = UUID.randomUUID().toString() + extension;

    // Upload no MinIO
    PutObjectArgs args = PutObjectArgs.builder()
            .bucket("meu-bucket")
            .object(uniqueName)
            .stream(finalStream, bytes.length, -1)
            .contentType(contentType)
            .build();

    minioClient.putObject(args);

    return uniqueName;
}



    // Download
    public GetObjectResponse download(String objectName) throws Exception {
        return minioClient.getObject(
                GetObjectArgs.builder()
                        .bucket("meu-bucket")
                        .object(objectName)
                        .build());
    }

    // Remover arquivo
    public void delete(String bucket, String objectName) throws Exception {
        minioClient.removeObject(
                RemoveObjectArgs.builder()
                        .bucket(bucket)
                        .object(objectName)
                        .build());
    }

    // URL pré-assinada (download temporário)
    public String presignedGetUrl(String bucket, String objectName, int expirySeconds) throws Exception {
        return minioClient.getPresignedObjectUrl(
                GetPresignedObjectUrlArgs.builder()
                        .method(Method.GET)
                        .bucket(bucket)
                        .object(objectName)
                        .expiry(expirySeconds, TimeUnit.SECONDS)
                        .build());
    }
}
