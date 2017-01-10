package domain.product;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author Claudio E. de Oliveira<claudioe@ciandt.com>
 */
@SpringCloudApplication
public class ProductServer {

    public static void main(String[] args) {
        SpringApplication.run(ProductServer.class, args);
    }

}
