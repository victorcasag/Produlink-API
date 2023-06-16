package bighouse.restapi.model;

import jakarta.persistence.*;

@Entity(name = "category")
@Table(indexes = {
        @Index(name = "index_id",columnList = "id",unique = true),
        @Index(name = "index_category",columnList = "category",unique = true),
        @Index(name = "index_subCategory",columnList = "subCategory",unique = true)
})
public class ModelCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 100)
    public String category;
    @Column(nullable = false, length = 100)
    public String subCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
}
