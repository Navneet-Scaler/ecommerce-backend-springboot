package com.navneet.fakestoreapi_spring_bend;

import models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakeStrApiSpringBendApplication {

    public static void main(String[] args) {

        SpringApplication.run(FakeStrApiSpringBendApplication.class, args);

        Product product = new Product();


    }

}
