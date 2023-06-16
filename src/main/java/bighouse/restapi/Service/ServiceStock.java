package bighouse.restapi.Service;

import bighouse.restapi.repository.RepositoryStock;

public class ServiceStock {
    private RepositoryStock repositoryStock;

    public ServiceStock(RepositoryStock repositoryStock) {
        this.repositoryStock = repositoryStock;
    }
}
