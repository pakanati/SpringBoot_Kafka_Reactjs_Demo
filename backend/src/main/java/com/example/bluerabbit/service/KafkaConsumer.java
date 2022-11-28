package com.example.bluerabbit.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	
	
	@KafkaListener(topics = "NewProduct_Addition_Topic", groupId = "My_group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("Message Received from Kafka Producer >>>> ");
		System.out.println(receivedMessage);
	}
	
}

