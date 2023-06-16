package bighouse.restapi.controller;

import bighouse.restapi.model.ModelProduct;
import bighouse.restapi.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/Product")
public class ControllerProduct {
    @Autowired
    private RepositoryProduct repository;
    @GetMapping
    public List<ModelProduct> ConsultAllProducts(){
        return (List<ModelProduct>) repository.findAll();
    }
    @GetMapping(path = "/api/product/{id}")
    public ResponseEntity ConsultUserById(@PathVariable("id") Integer id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ModelProduct InsertProduct(@RequestBody ModelProduct product){
        return repository.save(product);
    }
    @DeleteMapping(path = "/api/product/{id}")
    public void DeleteAllUserById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

}
