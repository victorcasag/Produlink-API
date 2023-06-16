package bighouse.restapi.model;

import jakarta.persistence.*;

@Entity(name = "stock")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true)
})
public class ModelStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(length = 100, nullable = false)
    public int quantityStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
}
