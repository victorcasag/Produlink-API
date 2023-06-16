package bighouse.restapi.model;

import jakarta.persistence.*;

@Entity(name = "login")
@Table(indexes = {
        @Index(name = "index_id", columnList = "id", unique = true),
        @Index(name = "index_login", columnList = "login", unique = true)
})
public class ModelLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, length = 50)
    public String name;
    @Column(nullable = false, length = 50)
    public String login;
    @Column(nullable = false, length = 50)
    public String password;
    @Column(nullable = false, length = 20)
    public String role;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
