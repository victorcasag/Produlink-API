package bighouse.restapi.Service;

import bighouse.restapi.repository.RepositoryVendor;
import org.springframework.stereotype.Service;

@Service
public class ServiceVendor {
    private RepositoryVendor repositoryVendor;

    public ServiceVendor(RepositoryVendor repositoryVendor) {
        this.repositoryVendor = repositoryVendor;
    }
}
