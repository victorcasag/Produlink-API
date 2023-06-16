package bighouse.restapi.model;

import jakarta.persistence.*;

@Entity(name = "vendor")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true),
        @Index(name = "index_cnpj", columnList = "cnpj", unique = true),
        @Index(name = "index_imei", columnList = "imei", unique = true),
        @Index(name = "index_email", columnList = "email", unique = true)
})
public class ModelVendor {
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId", referencedColumnName = "id", nullable = false)
    public ModelAddress address;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 255)
    public String corporateName;
    @Column(nullable = true, length = 255)
    public String tradingName;
    @Column(nullable = false, length = 14)
    public int cnpj;
    @Column(nullable = false, length = 15)
    public int imei;
    @Column(nullable = false, length = 20)
    public int phone;
    @Column(nullable = false, length = 80, unique = true)
    public String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
