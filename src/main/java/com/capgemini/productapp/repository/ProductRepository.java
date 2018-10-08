package com.capgemini.productapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.productapp.entity.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
