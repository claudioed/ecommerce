package domain.product.resource;

import domain.product.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductResource extends MongoRepository<Product,String>{
}
