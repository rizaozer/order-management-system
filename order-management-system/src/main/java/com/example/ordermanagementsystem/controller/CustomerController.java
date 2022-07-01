package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.Customer;
import com.example.ordermanagementsystem.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void createCustomer(@RequestBody Customer customer) {
        customerService.insert(customer);
    }
}
