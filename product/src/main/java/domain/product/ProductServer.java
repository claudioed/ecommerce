package domain.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Claudio E. de Oliveira<claudioe@ciandt.com>
 */
@SpringCloudApplication
@EnableZuulProxy
@EnableHystrix
public class ProductServer implements HealthIndicator {

    public static void main(String[] args) {
        SpringApplication.run(ProductServer.class, args);
    }

    @Override
    public Health health() {
        return Health.up().build();
    }

}
