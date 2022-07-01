package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.dao.ProductRepository;
import com.example.ordermanagementsystem.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractService<Product, Long, ProductRepository> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }

}
