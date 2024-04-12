package com.navneet.fakestoreapi_spring_bend.controllers;

import com.navneet.fakestoreapi_spring_bend.models.Product;
import com.navneet.fakestoreapi_spring_bend.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController // This is capable to host HTTP APIs
@RequestMapping("/products") // All the requests which are coming to this port localhost:8080/products -> ProductController
public class ProductController { // Waiter - user interact with controller so it should be public
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }


    // localhost:8080/products/10
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
    return productService.getProductById(id);
    }


    //localhost:8080/products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
