package com.example.ordermanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class OrderManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagementSystemApplication.class, args);
    }

}
