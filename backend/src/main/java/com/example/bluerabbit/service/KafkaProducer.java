package com.example.bluerabbit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public void publishMessage(String message) {
		kafkaTemplate.send("NewProduct_Addition_Topic", message);
	}
	
}


