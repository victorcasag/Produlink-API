package bighouse.restapi.repository;

import bighouse.restapi.model.ModelAddress;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAddress extends CrudRepository<ModelAddress, Long> {
}
