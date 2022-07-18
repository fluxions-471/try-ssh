package com.domain.models.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
    
    List<Product> findByNameContains(String name);
}
