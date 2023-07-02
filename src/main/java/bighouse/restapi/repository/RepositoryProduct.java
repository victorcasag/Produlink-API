package bighouse.restapi.repository;

import bighouse.restapi.model.ModelProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryProduct extends CrudRepository<ModelProduct, Long> {
}
