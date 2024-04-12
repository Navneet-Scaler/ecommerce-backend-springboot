package com.navneet.fakestoreapi_spring_bend.services;

import com.navneet.fakestoreapi_spring_bend.models.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Long id);

    List<Product> getAllProducts();
}
