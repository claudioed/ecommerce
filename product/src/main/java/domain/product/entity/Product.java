package domain.product.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@Data
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

}
