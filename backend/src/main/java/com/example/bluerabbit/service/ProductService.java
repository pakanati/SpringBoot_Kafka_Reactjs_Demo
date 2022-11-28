package com.example.bluerabbit.service;

import java.util.List;

import com.example.bluerabbit.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
}
