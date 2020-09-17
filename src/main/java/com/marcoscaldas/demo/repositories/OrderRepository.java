package com.marcoscaldas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscaldas.demo.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
