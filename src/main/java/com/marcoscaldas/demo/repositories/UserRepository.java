package com.marcoscaldas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoscaldas.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
