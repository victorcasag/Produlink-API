package bighouse.restapi.repository;

import bighouse.restapi.model.ModelSale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySales extends CrudRepository<ModelSale, Long> {
}
