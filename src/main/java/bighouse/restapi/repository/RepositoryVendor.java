package bighouse.restapi.repository;

import bighouse.restapi.model.ModelVendor;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryVendor extends CrudRepository<ModelVendor, Long> {
}
