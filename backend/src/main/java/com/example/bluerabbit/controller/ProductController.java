package com.example.bluerabbit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bluerabbit.model.Product;
import com.example.bluerabbit.service.ProductService;
import com.example.bluerabbit.service.KafkaProducer;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	KafkaProducer kafkaProducer;
	
	@PostMapping("/add")
	public String add(@RequestBody Product product) {
		productService.saveProduct(product);

		// Send Message to Kafka Producer
		kafkaProducer.publishMessage("New Product Created: " + product.toString());
		
		return "Product Added Successfully.....";
	}
	
	@GetMapping("/getAll")
	public List<Product> getProducts() {
		return productService.getAllProducts();
	}

}


