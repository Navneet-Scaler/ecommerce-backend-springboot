package com.navneet.fakestoreapi_spring_bend.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDto {
    private Long id;
    private String title;
    private String description;
}