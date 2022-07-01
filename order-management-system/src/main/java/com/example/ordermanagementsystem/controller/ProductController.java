package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.Product;
import com.example.ordermanagementsystem.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.insert(product);
    }
}
