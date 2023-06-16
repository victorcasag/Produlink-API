package bighouse.restapi.Service;

import bighouse.restapi.repository.RepositoryVendor;

public class ServiceVendor {
    private RepositoryVendor repositoryVendor;

    public ServiceVendor(RepositoryVendor repositoryVendor) {
        this.repositoryVendor = repositoryVendor;
    }
}
