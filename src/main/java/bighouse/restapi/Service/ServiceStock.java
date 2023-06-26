package bighouse.restapi.Service;

import bighouse.restapi.repository.RepositoryStock;
import org.springframework.stereotype.Service;

@Service
public class ServiceStock {
    private RepositoryStock repositoryStock;

    public ServiceStock(RepositoryStock repositoryStock) {
        this.repositoryStock = repositoryStock;
    }
}
