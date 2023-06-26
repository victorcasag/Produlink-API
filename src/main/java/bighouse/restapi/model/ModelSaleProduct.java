package bighouse.restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity(name = "saleProduct")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true)
})
public class ModelSaleProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "saleId", referencedColumnName = "id", nullable = false)
    public ModelSale sale;
    @Column(name = "discount", nullable = true, length = 10)
    public double discount;
    @Column(name = "total", nullable = false, length = 10)
    public double total;
    @Column(name = "date_creation", nullable = false, length = 10)
    public LocalDate dateCreation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ModelSale getSale() {
        return sale;
    }

    public void setSale(ModelSale sale) {
        this.sale = sale;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
