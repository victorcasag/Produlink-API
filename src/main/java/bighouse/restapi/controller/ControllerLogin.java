package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceLogin;
import bighouse.restapi.model.ModelLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/login")
public class ControllerLogin {
    private final ServiceLogin serviceLogin;

    @Autowired
    public ControllerLogin(ServiceLogin serviceLogin) {
        this.serviceLogin = serviceLogin;
    }

    @GetMapping("/search")
    public List<ModelLogin> ConsultAllUsers(){ return (List<ModelLogin>) serviceLogin.FindAll(); }

    @GetMapping(value = "/search/by-name/{login}")
    public ModelLogin ConsultUserByLogin(@PathVariable String login){
        return serviceLogin.FindByLogin(login);
    }

    @GetMapping(value = "/search/{id}")
    public ModelLogin ConsultUserById(@PathVariable Long id){
        return serviceLogin.FindById(id);
    }
    @PostMapping(path = "/insert")
    public ModelLogin InsertUser(@RequestBody ModelLogin user){
        return serviceLogin.SaveLogin(user);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void DeleteAllUserById(@PathVariable Long id){
        serviceLogin.DeleteLogin(id);
    }

}
