package domain.order.resource;

import domain.order.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Claudio E. de Oliveira<claudioe@ciandt.com>
 */
@RepositoryRestResource(collectionResourceRel = "orders",path = "order")
public interface OrderResource extends MongoRepository<Order,String>{}
