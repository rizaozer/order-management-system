package com.example.ordermanagementsystem.entity;

import lombok.Data;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Data
@Embeddable
public class OrderLine {

    @ManyToOne
    private Product product;
    private int quantity;
}
