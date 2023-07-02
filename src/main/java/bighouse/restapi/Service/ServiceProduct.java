package bighouse.restapi.Service;

import bighouse.restapi.model.ModelClient;
import bighouse.restapi.model.ModelProduct;
import bighouse.restapi.repository.RepositoryClient;
import bighouse.restapi.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceProduct {
    private final RepositoryProduct repositoryProduct;

    @Autowired
    public ServiceProduct(RepositoryProduct repositoryProduct) {
        this.repositoryProduct = repositoryProduct;
    }

    public ModelProduct FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID product invalid");
        }

        Optional<ModelProduct> optionalProduct = repositoryProduct.findById(id);

        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new NoSuchElementException("Product not found");
        }
    }

    public List<ModelProduct> FindAll(){
        return (List<ModelProduct>) repositoryProduct.findAll();
    }

    public ModelProduct InsertProduct(ModelProduct client){
        return repositoryProduct.save(client);
    }

    public void DeleteById(long id){
        repositoryProduct.deleteById(id);
    }
}
