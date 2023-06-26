package bighouse.restapi.repository;

import bighouse.restapi.model.ModelSaleProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySaleProduct extends CrudRepository<ModelSaleProduct, Long> {
}
