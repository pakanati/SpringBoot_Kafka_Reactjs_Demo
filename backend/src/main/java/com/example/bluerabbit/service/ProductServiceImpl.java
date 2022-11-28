package com.example.bluerabbit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bluerabbit.model.Product;
import com.example.bluerabbit.respository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	
	@Override
	public List<Product> getAllProducts() {
	
		return productRepository.findAll();
	}
	
	

}
