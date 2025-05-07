package fr.insa.opticv.opticvback.model;

import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private List<CV> cvList;
    private Data data;

    public User(String username, String password, String email, List<CV> cvList, Data data) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.cvList = cvList;
        this.data = data;
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

}
