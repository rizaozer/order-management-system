package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.entity.Customer;
import com.example.ordermanagementsystem.entity.Order;
import com.example.ordermanagementsystem.entity.Product;
import com.example.ordermanagementsystem.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        orderService.insert(order);
    }

    @GetMapping("search/{date}")
    public List<Order> searchOrderByDate(@PathVariable LocalDate date) {
        return orderService.searchOrdersByDate(date);
    }

    @GetMapping("search/{customer}")
    public List<Order> searchOrderByCustomer(@PathVariable Customer customer) {
        return orderService.searchOrdersByCustomerName(customer.getFullName());
    }

    @GetMapping("search/{product}")
    public List<Order> searchOrderByProduct(@PathVariable Product product) {
        return orderService.searchOrdersByProductName(product.getName());
    }

    @PutMapping ("{id}/product-name/quantity")
    public Order changeQuantity(@PathVariable long id, @RequestParam String productName, @RequestBody int newQuantity) {
        return orderService.changeQuantity(id, newQuantity, productName);
    }


}
