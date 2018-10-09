package com.capgemini.productapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.exception.ProductNotFoundException;
import com.capgemini.productapp.repository.ProductRepository;
import com.capgemini.productapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public void delete(Product product) {
	
		productRepository.delete(product);
	}

	@Override
	public Product findProductById(int productId) throws ProductNotFoundException {
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isPresent())
			return optionalProduct.get();
		throw new ProductNotFoundException("Product does not exists");
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return productRepository.findByProductCategory(category);
	}

	@Override
	public List<Product> getProductByCategoryAndPrice(String category, double from, double to) {
		return productRepository.findByProductPrice(category, from, to);
	}


	/*@Override
	public Product findProductByName(String productName) throws ProductNotFoundException {
	   Optional<Product> optionalProduct = productRepository.findProductByName(productName);
	   if(optionalProduct.isPresent())
		   return optionalProduct.get();
	   throw new ProductNotFoundException("Product doesnot exists");
	}

	@Override
	public Product findProductByCategory(double minPrice, double maxPrice) throws ProductNotFoundException {
		
		Optional<Product> optionalProduct = productRepository.findProductByCategory(minPrice, maxPrice);
		if(optionalProduct.isPresent())
			return optionalProduct.get();
		throw new ProductNotFoundException("Product doesnot exists");
	}*/

}

