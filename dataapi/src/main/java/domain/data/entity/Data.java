package domain.data.entity;

import java.util.Map;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@lombok.Data
public class Data {

    private String id;

    private String entity;

    private Map<String,Object> data;

}
