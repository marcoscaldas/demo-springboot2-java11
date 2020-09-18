package com.marcoscaldas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.marcoscaldas.demo.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
