package bighouse.restapi.Service;

import bighouse.restapi.model.ModelLogin;
import bighouse.restapi.repository.RepositoryLogin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceLogin {
    private final RepositoryLogin repositoryLogin;

    public ServiceLogin(RepositoryLogin repositoryLogin){ this.repositoryLogin = repositoryLogin; }

    public ModelLogin FindById(Long id){
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID Login invalid");
        }

        Optional<ModelLogin> optionalLogin = repositoryLogin.findById(id);

        if (optionalLogin.isPresent()) {
            return optionalLogin.get();
        } else {
            throw new NoSuchElementException("Login not found");
        }
    }

    public List<ModelLogin> FindAll(){
        return (List<ModelLogin>) repositoryLogin.findAll();
    }

    public ModelLogin FindByLogin(String login){
        return repositoryLogin.findByLogin(login);
    }

    public ModelLogin SaveLogin(ModelLogin login){
        login.setLogin(login.getLogin().toLowerCase());
        return repositoryLogin.save(login);
    }

    public void DeleteLogin(long id){
        repositoryLogin.deleteById(id);
    }

}
