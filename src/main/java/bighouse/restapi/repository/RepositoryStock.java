package bighouse.restapi.repository;


import bighouse.restapi.model.ModelStock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStock extends CrudRepository<ModelStock, Long> {
}
