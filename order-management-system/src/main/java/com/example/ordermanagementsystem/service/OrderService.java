package com.example.ordermanagementsystem.service;

import com.example.ordermanagementsystem.api.OrderSearch;
import com.example.ordermanagementsystem.dao.OrderRepository;
import com.example.ordermanagementsystem.entity.Order;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService extends AbstractService<Order, Long, OrderRepository> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }

    public List<Order> searchOrdersByProductName(String productName) {
        return repository.findAllByProductName(productName);
    }

    public List<Order> searchOrdersByCustomerName(String fullName) {
        return repository.findAllByCustomerName(fullName);
    }

    public List<Order> searchOrdersByDate(LocalDate date) {
        return repository.findAllByCreationDate(date);
    }

    public List<Order> searchOrdersByProductSkuCode(long skuCode) {
        return repository.findAllByProductSkuCode(skuCode);
    }

    public Order changeQuantity(long id, int newQuantity, String productName) {
        Optional<Order> order = repository.findById(id);
        if(order.isEmpty()) {
            return null;
        }
        order.get().getOrderLines().stream()
                .filter(orderLine -> orderLine.getProduct().getName().equals(productName))
                .findFirst().ifPresent(orderLine -> orderLine.setQuantity(newQuantity));
        return  order.get();
    }

    public List<Order> search(OrderSearch orderSearch) {
        return switch (orderSearch.getKey()) {
            case DATE -> repository.findAllByCreationDate(orderSearch.getDateValue());
            case CUSTOMER -> repository.findAllByCustomerName(orderSearch.getStringValue());
            case PRODUCT_NAME -> repository.findAllByProductName(orderSearch.getStringValue());
            case PRODUCT_SKU -> repository.findAllByProductSkuCode(orderSearch.getIntegerValue());
        };
    }

}










