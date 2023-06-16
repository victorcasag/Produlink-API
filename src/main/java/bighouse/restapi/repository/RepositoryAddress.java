package bighouse.restapi.repository;

import bighouse.restapi.model.ModelAddress;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryAddress extends CrudRepository<ModelAddress, Long> {
}
