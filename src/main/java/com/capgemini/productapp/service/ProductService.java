package com.capgemini.productapp.service;

import java.util.List;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.exception.ProductNotFoundException;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void delete(Product product);
	public Product findProductById(int productId)throws ProductNotFoundException;
    public List<Product> findByProductName(String productName) throws ProductNotFoundException;
	
	public List<Product> findByProductCategory(String productCategory) throws ProductNotFoundException;
	
	public List<Product> findByProductByRange(String productCategory, double min, double max) throws ProductNotFoundException;
}