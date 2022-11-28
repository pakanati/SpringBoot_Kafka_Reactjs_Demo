# SpringBoot_Kafka_Reactjs_Demo
Demo application using SpringBoot Kafka and Reactjs


This demo application has:
1. backend
2. frontend

Backend application is done using spring boot, kafka and mysql
Frontend application is done using Reactjs and material ui


* When a new product is created from the Web application UI
* The product is saved into the database table
* And new message is published to Kafka Topic: NewProduct_Addition_Topic
* Kafka consumer receives the message and prints it on to the console
