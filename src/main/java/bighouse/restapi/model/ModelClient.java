package bighouse.restapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "client")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true),
        @Index(name = "index_cpf", columnList = "cpf", unique = true),
        @Index(name = "index_phone", columnList = "phone", unique = true),
        @Index(name = "index_email", columnList = "email", unique = true)
})
public class ModelClient {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address", referencedColumnName = "id", nullable = false)
    public ModelAddress address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name = "name", nullable = false, length = 255)
    public String name;
    @Column(name = "phone", nullable = false, length = 20)
    public String phone;
    @Column(name = "cpf", nullable = false, length = 14, unique = true)
    public String cpf;
    @Column(name = "rg", nullable = false, length = 10, unique = true)
    public String rg;
    @Column(name = "email", nullable = false, length = 80, unique = true)
    public String email;
    @Column(name = "dateOfBorn", nullable = false, length = 10)
    public LocalDate dateOfBorn;
    @Column(name = "sex", nullable = false, length = 80)
    public String sex;
    @Column(name = "urlPhoto", nullable = true, length = 100)
    public String urlPhoto;
    @Column(name = "nameOfMother", nullable = false, length = 255)
    public String nameOfMother;
    @Column(name = "nameOfFather", nullable = true, length = 255)
    public String nameOfFather;
    @Column(name = "profession", nullable = false, length = 150)
    public String profession;
    @Column(name = "telephone", nullable = true, length = 20)
    public String telephone;
    @Column(name = "dateCreation", nullable = false, length = 10)
    public LocalDate dateCreation;
    @Column(name = "lastUpdate", nullable = false, length = 10)
    public LocalDate lastUpdate;
    @Column(name = "creditLimit", nullable = false, length = 10)
    public double creditLimit;

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public ModelAddress getAddress() {
        return address;
    }

    public void setAddress(ModelAddress address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBorn() {
        return dateOfBorn;
    }

    public void setDateOfBorn(LocalDate dateOfBorn) {
        this.dateOfBorn = dateOfBorn;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

    public void setNameOfMother(String nameOfMother) {
        this.nameOfMother = nameOfMother;
    }

    public String getNameOfFather() {
        return nameOfFather;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
