package com.example.ordermanagementsystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Order {

    @Id
    @GeneratedValue
    private long id;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<OrderLine> orderLines;
    @ManyToOne
    private Customer customer;
    private LocalDate creationDate;
}
