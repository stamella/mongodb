package com.capgemini.productapp.service;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.exception.ProductNotFoundException;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void delete(Product product);
	public Product findProductById(int productId)throws ProductNotFoundException;
    public Product findProductByName(String productName);
}
