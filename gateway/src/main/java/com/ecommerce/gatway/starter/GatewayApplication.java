package com.ecommerce.gatway.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by fernandofazolli on 12/01/17.
 */
@SpringCloudApplication
@EnableZuulProxy
public class GatewayApplication {
    public static void main(String... args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
