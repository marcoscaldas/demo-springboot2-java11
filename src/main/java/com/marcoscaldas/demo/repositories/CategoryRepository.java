package com.marcoscaldas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscaldas.demo.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
