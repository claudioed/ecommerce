package domain.order.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author Claudio E. de Oliveira<claudioe@ciandt.com>
 */
@Data
public class Order {

    @Id
    private String id;

    private String user;

    private List<Item> items;

}
