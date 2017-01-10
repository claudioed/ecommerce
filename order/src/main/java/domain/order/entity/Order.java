package domain.order.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Claudio E. de Oliveira<claudioe@ciandt.com>
 */
@Data
public class Order {

    private String id;

    private String user;

    private List<Item> items;

}
