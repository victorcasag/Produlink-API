package bighouse.restapi.repository;

import bighouse.restapi.model.ModelCategory;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCategory extends CrudRepository<ModelCategory, Long> {
}
