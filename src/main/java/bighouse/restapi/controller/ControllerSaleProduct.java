package bighouse.restapi.controller;

import bighouse.restapi.Service.ServiceSaleProduct;
import bighouse.restapi.Service.ServiceSales;
import bighouse.restapi.model.ModelSale;
import bighouse.restapi.model.ModelSaleProduct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/sale-product")
public class ControllerSaleProduct {

    private final ServiceSaleProduct serviceSaleProduct;

    public ControllerSaleProduct(ServiceSaleProduct serviceSaleProduct) {
        this.serviceSaleProduct = serviceSaleProduct;
    }

    @GetMapping("/search")
    public List<ModelSaleProduct> FindAll(){ return (List<ModelSaleProduct>) serviceSaleProduct.FindAll(); }
    @GetMapping(value = "/search/{id}")
    public ModelSaleProduct FindById(@PathVariable Long id){
        return serviceSaleProduct.FindById(id);
    }
    @PostMapping(path = "/insert")
    public ModelSaleProduct InsertUser(@RequestBody ModelSaleProduct saleProduct){
        return serviceSaleProduct.InsertSaleProduct(saleProduct);
    }
    @DeleteMapping(path = "/delete/{id}")
    public void DeleteById(@PathVariable Long id){
        serviceSaleProduct.DeleteById(id);
    }

}
