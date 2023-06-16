package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceAddress;
import bighouse.restapi.model.ModelAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/address")
public class ControllerAddress {
    private ServiceAddress serviceAddress;
    @Autowired
    public ControllerAddress(ServiceAddress serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    @GetMapping(value = "/search")
    public List<ModelAddress> FindAll(){
        return (List<ModelAddress>) serviceAddress.FindAll();
    }

    @GetMapping(value = "/search/by-id/{id}")
    public ModelAddress FindById(@PathVariable Long id){
        return serviceAddress.FindById(id);
    }

    @PostMapping(value = "/insert")
    public ModelAddress InsertAddress(@RequestBody ModelAddress address){
        return serviceAddress.InsertAddress(address);
    }

}
