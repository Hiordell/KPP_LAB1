package com.Lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TriangleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TriangleApplication.class, args);
    }

}

//http://localhost:8080/triangleJson?side1=3&side2=4&side3=5
//http://localhost:8080/triangle