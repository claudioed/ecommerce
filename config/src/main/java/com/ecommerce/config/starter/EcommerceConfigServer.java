package com.ecommerce.config.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EcommerceConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(EcommerceConfigServer.class, args);
    }
}