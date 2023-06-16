package bighouse.restapi.repository;

import bighouse.restapi.model.ModelSales;
import org.springframework.data.repository.CrudRepository;

public interface RepositorySales extends CrudRepository<ModelSales, Long> {
}
