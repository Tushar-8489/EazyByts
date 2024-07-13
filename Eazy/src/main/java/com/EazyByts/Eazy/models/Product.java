package com.EazyByts.Eazy.models;

import java.sql.Date;


import jakarta.persistence.*;


@Entity
@Table(name = "customers")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String email;
    private String phone;
    
    @Column(columnDefinition = "TEXT")
    private String address;
    private Date createdAT;
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getCreatedAT() {
        return createdAT;
    }
    public void setCreatedAT(java.util.Date createdAt2) {
        this.createdAT = (Date)createdAt2;
    }

}
