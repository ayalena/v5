package com.eindproject.v5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private final String email;
    private final String password;
    private final String userName;


    public User(long id, String email, String password, String userName) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}
