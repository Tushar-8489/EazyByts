package com.EazyByts.Eazy.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EazyByts.Eazy.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
