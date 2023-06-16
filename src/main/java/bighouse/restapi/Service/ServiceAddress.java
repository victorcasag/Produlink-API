package bighouse.restapi.Service;

import bighouse.restapi.model.ModelAddress;
import bighouse.restapi.repository.RepositoryAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceAddress {
    private RepositoryAddress repositoryAddress;

    @Autowired
    public ServiceAddress(RepositoryAddress repositoryAddress) {
        this.repositoryAddress = repositoryAddress;
    }

    public ModelAddress FindById(Long id) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID Address invalid");
        }

        Optional<ModelAddress> optionalAddress = repositoryAddress.findById(id);

        if (optionalAddress.isPresent()) {
            return optionalAddress.get();
        } else {
            throw new NoSuchElementException("Address not found");
        }
    }

    public List<ModelAddress> FindAll() {
        return (List<ModelAddress>) repositoryAddress.findAll();
    }

    public ModelAddress InsertAddress(ModelAddress client) {
        return repositoryAddress.save(client);
    }

    public void DeleteById(long id) {
        repositoryAddress.deleteById(id);
    }

}
