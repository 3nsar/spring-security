package com.spring_security.spring_security.model;

import jakarta.persistence.*;

import java.security.cert.Certificate;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user;
    private String password;

    public Users(){

    }

    public  Users(int id, String user, String password){
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUser(String user){
        this.user = user;
    }

    public String getUser(){
        return user;
    }

    public void setPassword(String password){
        this.password =password;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
