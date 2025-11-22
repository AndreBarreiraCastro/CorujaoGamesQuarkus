package org.acme.service;

import io.minio.MinioClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class MinioClientProducer {

    @ConfigProperty(name = "minio.host")
    String host;

    @ConfigProperty(name = "minio.port")
    int port;

    @ConfigProperty(name = "minio.secure")
    boolean secure;

    @ConfigProperty(name = "minio.access-key")
    String accessKey;

    @ConfigProperty(name = "minio.secret-key")
    String secretKey;

    @Produces
    @ApplicationScoped
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(host,port,secure)
                .credentials(accessKey, secretKey)
                .build();
    }
}
