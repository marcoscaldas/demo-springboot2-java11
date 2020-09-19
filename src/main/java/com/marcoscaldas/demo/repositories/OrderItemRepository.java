package com.marcoscaldas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscaldas.demo.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
