package bighouse.restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "sales")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true)
})
public class ModelSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId", referencedColumnName = "id", nullable = false)
    public ModelClient client;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId", referencedColumnName = "id", nullable = false)
    public ModelProduct product;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saleProductID", referencedColumnName = "id", nullable = false)
    public ModelSaleProduct saleProduct;
    @Column(nullable = false, length = 15)
    public double totalValue;
    @Column(nullable = false, length = 15)
    public double priceSale;
    @Column(nullable = false, length = 10)
    public LocalDate dateCreation;
    @Column(nullable = true, length = 15)
    public double discount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModelClient getClient() {
        return client;
    }

    public void setClient(ModelClient client) {
        this.client = client;
    }

    public ModelProduct getProduct() {
        return product;
    }

    public void setProduct(ModelProduct product) {
        this.product = product;
    }

    public ModelSaleProduct getSaleProduct() {
        return saleProduct;
    }

    public void setSaleProduct(ModelSaleProduct saleProduct) {
        this.saleProduct = saleProduct;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
