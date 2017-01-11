package domain.sales.resource;

import domain.sales.entity.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@RepositoryRestResource(collectionResourceRel = "sales", path = "sale")
public interface SalesResource extends MongoRepository<Sales,String>{
}
