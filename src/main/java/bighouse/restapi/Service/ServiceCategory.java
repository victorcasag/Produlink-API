package bighouse.restapi.Service;

import bighouse.restapi.model.ModelCategory;
import bighouse.restapi.model.ModelLogin;
import bighouse.restapi.repository.RepositoryCategory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceCategory {
    RepositoryCategory repositoryCategory;

    public ServiceCategory(RepositoryCategory repositoryCategory) {
        this.repositoryCategory = repositoryCategory;
    }
    public ModelCategory FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID category invalid");
        }

        Optional<ModelCategory> optionalCategory = repositoryCategory.findById(id);

        if (optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            throw new NoSuchElementException("category not found");
        }
    }

    public List<ModelCategory> FindAll(){
        return (List<ModelCategory>) repositoryCategory.findAll();
    }

    public ModelCategory Insert(ModelCategory category){
        return repositoryCategory.save(category);
    }

    public void Delete(long id){
        repositoryCategory.deleteById(id);
    }
}
