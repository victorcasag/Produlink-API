package bighouse.restapi.Service;

import bighouse.restapi.repository.RepositoryCategory;
import org.springframework.stereotype.Service;

@Service
public class ServiceCategory {
    RepositoryCategory repositoryCategory;

    public ServiceCategory(RepositoryCategory repositoryCategory) {
        this.repositoryCategory = repositoryCategory;
    }
}
