package com.ecommerce.discovery.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by fernandofazolli on 11/01/17.
 */
@SpringCloudApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String... args) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
