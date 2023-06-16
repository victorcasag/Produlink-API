package bighouse.restapi.repository;

import bighouse.restapi.model.ModelClient;
import bighouse.restapi.model.ModelLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends JpaRepository<ModelClient, Long> {
    ModelClient findByCpf(String cpf);
}
