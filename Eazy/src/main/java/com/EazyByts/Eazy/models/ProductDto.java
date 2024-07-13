package com.EazyByts.Eazy.models;

import jakarta.validation.constraints.*;

public class ProductDto {
    @NotEmpty(message = "The Name is Required")
    private String name;

    @NotEmpty(message = "Address is Required")
    private String address;

    @NotEmpty(message = "Contact Number is Required")
    private String phone;

    @NotEmpty(message = "Email is Required")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    
}
