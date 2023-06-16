package bighouse.restapi.Service;

import bighouse.restapi.model.ModelClient;
import bighouse.restapi.repository.RepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceClient {
    private final RepositoryClient repositoryClient;

    @Autowired
    public ServiceClient(RepositoryClient repositoryClient) {
        this.repositoryClient = repositoryClient;
    }

    public ModelClient FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID client invalid");
        }

        Optional<ModelClient> optionalClient = repositoryClient.findById(id);

        if (optionalClient.isPresent()) {
            return optionalClient.get();
        } else {
            throw new NoSuchElementException("Client not found");
        }
    }

    public List<ModelClient> FindAll(){
        return repositoryClient.findAll();
    }

    public ModelClient FindByCPF(String cpf){
        return repositoryClient.findByCpf(cpf);
    }

    public ModelClient InsertClient(ModelClient client){
        return repositoryClient.save(client);
    }

    public void DeleteById(long id){
        repositoryClient.deleteById(id);
    }
}
