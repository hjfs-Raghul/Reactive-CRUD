package com.example.codegrill.product.repo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.codegrill.product.entity.Product;

@Repository
public interface ProductRepo extends ReactiveCrudRepository<Product, Long>{

}
