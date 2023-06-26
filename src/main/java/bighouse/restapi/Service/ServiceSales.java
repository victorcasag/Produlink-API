package bighouse.restapi.Service;

import bighouse.restapi.model.ModelSale;
import bighouse.restapi.repository.RepositorySales;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Service
public class ServiceSales {
    RepositorySales repositorySales;

    public ServiceSales(RepositorySales repositorySales) {
        this.repositorySales = repositorySales;
    }


    public ModelSale FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID Sale invalid");
        }

        Optional<ModelSale> optionalSale = repositorySales.findById(id);

        if (optionalSale.isPresent()) {
            return optionalSale.get();
        } else {
            throw new NoSuchElementException("Sale not found");
        }
    }

    public List<ModelSale> FindAll(){
        return (List<ModelSale>) repositorySales.findAll();
    }

    public ModelSale InsertSale(ModelSale sale){
        return repositorySales.save(sale);
    }

    public void DeleteById(long id){
        repositorySales.deleteById(id);
    }
}
