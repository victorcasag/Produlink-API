package bighouse.restapi.model;

import jakarta.persistence.*;

@Entity(name = "address")
@Table(indexes = {
        @Index(name = "index_id",columnList = "id", unique = true)
})
public class ModelAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 50)
    public String country;
    @Column(nullable = false, length = 2)
    public String state;
    @Column(nullable = false, length = 50)
    public String neighborhood;
    @Column(nullable = false, length = 10)
    public int number;
    @Column(nullable = false, length = 255)
    public String street;
    @Column(nullable = false, length = 9)
    public String zipcode;
    @Column(nullable = true, length = 255)
    public String reference;
    @Column(nullable = false, length = 50)
    public String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
