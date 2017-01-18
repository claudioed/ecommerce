package infra.conf;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@Service
@RefreshScope
public class ServicesConf {

    @Getter
    @Value("${hosts.product.address}")
    private final String productAddress;

    @Getter
    @Value("${hosts.order.address}")
    private final String orderAddress;

    @Getter
    @Value("${hosts.sales.address}")
    private final String salesAddress;

    @Autowired
    public ServicesConf(String productAddress, String orderAddress, String salesAddress) {
        this.productAddress = productAddress;
        this.orderAddress = orderAddress;
        this.salesAddress = salesAddress;
    }

}
