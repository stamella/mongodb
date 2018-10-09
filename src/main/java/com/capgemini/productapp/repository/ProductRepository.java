package com.capgemini.productapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.exception.ProductNotFoundException;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    


	@Query("{'productName':?0}")
	public List<Product> findByProductName(String name);

	@Query("{'productCategory':?0}")
	public List<Product> findByProductCategory(String category);

		@Query("{'productCategory':?0, 'productPrice': {$gt: ?1, $lt:?2}}")
	public List<Product> findByProductByRange(String productCategory, double min, double max);
}
