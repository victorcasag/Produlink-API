package bighouse.restapi.repository;


import bighouse.restapi.model.ModelStock;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryStock extends CrudRepository<ModelStock, Long> {
}
