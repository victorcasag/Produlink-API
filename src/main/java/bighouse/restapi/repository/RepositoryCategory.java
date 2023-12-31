package bighouse.restapi.repository;

import bighouse.restapi.model.ModelCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategory extends CrudRepository<ModelCategory, Long> {
}
