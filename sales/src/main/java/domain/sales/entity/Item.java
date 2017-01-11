package domain.sales.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@Data
public class Item {

    @Id
    private String id;

    private String name;

    private String description;

}
