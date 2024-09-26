package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

/*
Mit Tooling in der IDE ausführen, oder mit "mvn spring-boot:run" (oder "gradle bootRun")
Startet einen Tomcat Web Server und deployed die Web Applikation. Default Port: 8080
 */