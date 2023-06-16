package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceClient;
import bighouse.restapi.model.ModelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/client")
public class ControllerClient {
    private final ServiceClient serviceClient;

    @Autowired
    public ControllerClient(ServiceClient clientService) {
        this.serviceClient = clientService;
    }

    @GetMapping(value = "/search")
    public List<ModelClient> FindAll(){
        return (List<ModelClient>) serviceClient.FindAll();
    }

    @GetMapping(value = "/search/by-id/{id}")
    public ModelClient FindById(@PathVariable Long id) {
        return serviceClient.FindById(id);
    }

    @GetMapping(value = "/by-cpf/{cpf}")
    public ModelClient FindByCpf(@PathVariable String cpf){
        return serviceClient.FindByCPF(cpf);
    }

    @PostMapping(value = "/insert")
    public ModelClient InsertClient(@RequestBody ModelClient client){
        return serviceClient.InsertClient(client);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void DeleteUserById(@PathVariable Long id){
        serviceClient.DeleteById(id);
    }

}
