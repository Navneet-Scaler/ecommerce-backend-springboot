package com.navneet.fakestoreapi_spring_bend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String title;
    private String description;
    private Double price;
    private Category category;
    private String image;
//    private int quantity;

    /*
    // Replaced by args constructor
    Product(Long id, String title, String description, Double price, Category category, String image) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.image = image;
    }
    */
}