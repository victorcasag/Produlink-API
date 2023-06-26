package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceSales;
import bighouse.restapi.model.ModelLogin;
import bighouse.restapi.model.ModelSale;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/sale")
public class ControllerSales {
    private final ServiceSales serviceSales;

    public ControllerSales(ServiceSales serviceSales) {
        this.serviceSales = serviceSales;
    }

    @GetMapping("/search")
    public List<ModelSale> FindAll(){ return (List<ModelSale>) serviceSales.FindAll(); }
    @GetMapping(value = "/search/{id}")
    public ModelSale FindById(@PathVariable Long id){
        return serviceSales.FindById(id);
    }
    @PostMapping(path = "/insert")
    public ModelSale InsertUser(@RequestBody ModelSale sale){
        return serviceSales.InsertSale(sale);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void DeleteById(@PathVariable Long id){
        serviceSales.DeleteById(id);
    }

}
