# Getting Started


### 1. Endpoint to Add a new Product into database table
http://localhost:8080/product/add

Request Method: POST

Example Body:
{
    "name": "My Product 3",
    "description": "Product 3 Description."
}


### 2. Endpoint to retrieve list of all products from the database table

http://localhost:8080/product/getAll

Request Method: GET




### Installation and Setup Instructions

1. download and install docker

2. Run and bring up Docker Desktop

3. check docker version
docker --version

4. check process running
docker ps

5. bring up kafka and zookeeper using docker-compose.yml  (run in background)
docker-compose -f docker-compose.yml up -d

6. Simple command to connect to kafka shell  (interactive mode, name of the container and path to the shell)
docker exec -it broker /bin/sh

7. Change directory and create new topic in kafka
cd /bin
kafka-topics --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic NewProduct_Addition_Topic


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.0/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.0/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

