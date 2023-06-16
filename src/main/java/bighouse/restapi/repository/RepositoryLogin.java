package bighouse.restapi.repository;

import bighouse.restapi.model.ModelLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLogin extends JpaRepository<ModelLogin, Long> {
    ModelLogin findByLogin(String login);

}
