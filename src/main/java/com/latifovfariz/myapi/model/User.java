package com.latifovfariz.myapi.model;

public class User {

    private long id;
    private String name;
    private String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(long id, String username, String email) {
        this.id = id;
        this.name = username;
        this.email = email;
    }

    public User() {
    }
}
