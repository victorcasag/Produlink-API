package bighouse.restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "sales")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true)
})
public class ModelSales {
    //public ClientModel client;
    //public ProductModel product;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 15)
    public double totalPrice;
    @Column(nullable = false, length = 15)
    public double priceSale;
    @Column(nullable = false, length = 10)
    public LocalDate salesDate;
    @Column(nullable = true, length = 15)
    public double discount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public LocalDate getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(LocalDate salesDate) {
        this.salesDate = salesDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
