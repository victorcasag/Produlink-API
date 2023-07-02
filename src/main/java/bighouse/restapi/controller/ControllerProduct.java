package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceClient;
import bighouse.restapi.Service.ServiceProduct;
import bighouse.restapi.model.ModelLogin;
import bighouse.restapi.model.ModelProduct;
import bighouse.restapi.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/product")
public class ControllerProduct {
    @Autowired
    private final ServiceProduct serviceProduct;
    public ControllerProduct(ServiceProduct serviceProduct) {
        this.serviceProduct = serviceProduct;
    }
    @GetMapping(path = "/search")
    public List<ModelProduct> FindAll(){
        return (List<ModelProduct>) serviceProduct.FindAll();
    }
    @GetMapping(path = "/search/by-id/{id}")
    public ModelProduct FindById(@PathVariable Long id){
        return serviceProduct.FindById(id);
    }
    @PostMapping
    public ModelProduct InsertProduct(@RequestBody ModelProduct product){
        return serviceProduct.InsertProduct(product);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void DeleteAllUserById(@PathVariable("id") Long id){
        serviceProduct.DeleteById(id);
    }

}
