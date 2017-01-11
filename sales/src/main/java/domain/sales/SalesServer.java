package domain.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
public class SalesServer implements HealthIndicator {

    public static void main(String[] args) {
        SpringApplication.run(SalesServer.class, args);
    }

    @Override
    public Health health() {
        return Health.up().build();
    }

}

