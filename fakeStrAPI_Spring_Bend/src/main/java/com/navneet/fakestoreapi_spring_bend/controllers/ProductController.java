package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController // This is capable to host HTTP APIs
@RequestMapping("/products") // All the requests which are coming to this port localhost:8080/products -> ProductController
public class ProductController { // Waiter - user interact with controller so it should be public
//    public getProductById() {
//
//    }
}
