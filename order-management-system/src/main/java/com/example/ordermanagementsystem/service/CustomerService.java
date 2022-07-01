package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.dao.CustomerRepository;
import com.example.ordermanagementsystem.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService  extends AbstractService<Customer, Long, CustomerRepository> {


    public CustomerService(CustomerRepository repository) {
        super(repository);
    }

}
