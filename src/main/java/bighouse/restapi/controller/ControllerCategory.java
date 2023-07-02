package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceCategory;
import bighouse.restapi.model.ModelCategory;
import bighouse.restapi.model.ModelProduct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/category")
public class ControllerCategory {
    private final ServiceCategory serviceCategory;

    public ControllerCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @GetMapping(path = "/search")
    public List<ModelCategory> FindAll(){
        return (List<ModelCategory>) serviceCategory.FindAll();
    }
    @GetMapping(path = "/search/by-id/{id}")
    public ModelCategory FindById(@PathVariable Long id){
        return serviceCategory.FindById(id);
    }
    @PostMapping
    public ModelCategory InsertCategory(@RequestBody ModelCategory category){
        return serviceCategory.Insert(category);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void DeleteAllUserById(@PathVariable("id") Long id){
        serviceCategory.Delete(id);
    }
}
