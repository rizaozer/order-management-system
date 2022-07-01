package com.example.ordermanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private long id;
    private String registrationCode;
    private String fullName;
    private String email;
    private String phoneNumber;
    @OneToMany
    private List<Order> orders;
}
