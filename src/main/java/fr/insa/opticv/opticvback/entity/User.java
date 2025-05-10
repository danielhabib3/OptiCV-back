package fr.insa.opticv.opticvback.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"app_user\"")
public class User {
    private String username;
    private String password;
    private String email;
    @OneToMany
    private List<CV> cvList;
    @OneToOne
    @JoinColumn(name = "data_id")
    private Data data;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(String username, String password, String email, List<CV> cvList, Data data) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cvList = cvList;
        this.data = data;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CV> getCvList() {
        return cvList;
    }

    public void setCvList(List<CV> cvList) {
        this.cvList = cvList;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
