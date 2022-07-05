package com.example.ordermanagementsystem.dao;

import com.example.ordermanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByCreationDate(LocalDate creationDate);

    @Query("SELECT o FROM Order o WHERE o.customer.fullName = :name")
    List<Order> findAllByCustomerName(String name);

    @Query("SELECT o FROM Order o JOIN o.orderLines ol WHERE ol.product.name = :productName")
    List<Order> findAllByProductName(String productName);

    @Query("SELECT o FROM Order o JOIN o.orderLines ol WHERE ol.product.skuCode = :skuCode")
    List<Order> findAllByProductSkuCode(long skuCode);
}
