package com.model;

public class User {
    private int Id;
    private String Username;
    private String Password;
    private String Role;

    public User(int id, String username, String password, String role) {
        Id = id;
        Username = username;
        Password = password;
        Role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
