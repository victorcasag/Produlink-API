package bighouse.restapi.repository;

import bighouse.restapi.model.ModelVendor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVendor extends CrudRepository<ModelVendor, Long> {
}
