package bighouse.restapi.Service;

import bighouse.restapi.model.ModelSaleProduct;
import bighouse.restapi.repository.RepositorySaleProduct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class ServiceSaleProduct {
    RepositorySaleProduct repositorySaleProduct;

    public ServiceSaleProduct(RepositorySaleProduct repositorySaleProduct) {
        this.repositorySaleProduct = repositorySaleProduct;
    }

    public ModelSaleProduct FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID Sale Product invalid");
        }

        Optional<ModelSaleProduct> optionalSaleProduct = repositorySaleProduct.findById(id);

        if (optionalSaleProduct.isPresent()) {
            return optionalSaleProduct.get();
        } else {
            throw new NoSuchElementException("Sale Product not found");
        }
    }

    public List<ModelSaleProduct> FindAll(){
        return (List<ModelSaleProduct>) repositorySaleProduct.findAll();
    }

    public ModelSaleProduct InsertSaleProduct(ModelSaleProduct saleProduct){
        return repositorySaleProduct.save(saleProduct);
    }

    public void DeleteById(long id){
        repositorySaleProduct.deleteById(id);
    }

}
