package com.edutec.demoneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
@SpringBootApplication
@EnableNeo4jRepositories
public class Demoneo4jApplication {


	public static void main(String[] args) {
		SpringApplication.run(Demoneo4jApplication.class, args);
	}

}
