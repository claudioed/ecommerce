package domain.sales.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
public class Sales {

    @Id
    private String id;

    private List<Item> items;


}
