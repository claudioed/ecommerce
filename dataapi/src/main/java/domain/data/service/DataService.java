package domain.data.service;

import infra.conf.ServicesConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Claudio E. de Oliveira<claudioed.oliveira@gmail.com>
 */
@Component
public class DataService {

    private final ServicesConf servicesConf;

    private final RestTemplate restTemplate;

    @Autowired
    public DataService(ServicesConf servicesConf,RestTemplate restTemplate) {
        this.servicesConf = servicesConf;
        this.restTemplate = restTemplate;
    }

    public String getData(String entity,String argument){

        return "";
    }

}
