package bighouse.restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "product")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true),
        @Index(name = "index_barCode", columnList = "barCode", unique = true)
})
public class ModelProduct {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "id", nullable = false)
    public ModelCategory Category;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stockId", referencedColumnName = "id", nullable = false)
    public ModelStock Stock;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vendorId", referencedColumnName = "id", nullable = false)
    public ModelVendor Vendor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 50)
    public String name;
    @Column(nullable = false, length = 9)
    public double price;
    @Column(nullable = true, length = 100)
    public String description;
    @Column(nullable = false, length = 9)
    public double cost;
    @Column(nullable = false, length = 2)
    public String unit;
    @Column(nullable = false, length = 10)
    public LocalDate dateOfPurchase;
    @Column(nullable = false, length = 10)
    public LocalDate dateLastUpdate;
    @Column(nullable = false, length = 9)
    public double salePrice;
    @Column(nullable = false, length = 9)
    public double profitMargin;
    @Column(nullable = true, length = 100)
    public String urlPhoto;
    @Column(nullable = false, length = 13)
    public long barCode;
    @Column(nullable = false, length = 2)
    public String measure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public LocalDate getDateLastUpdate() {
        return dateLastUpdate;
    }

    public void setDateLastUpdate(LocalDate dateLastUpdate) {
        this.dateLastUpdate = dateLastUpdate;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }
}
