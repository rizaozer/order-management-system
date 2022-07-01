package com.example.ordermanagementsystem.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private long skuCode;
    private double unitPrice;
}
