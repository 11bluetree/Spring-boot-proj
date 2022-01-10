package com.example.springioc.repository;

import com.example.springioc.model.Coffe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeRepository extends JpaRepository<Coffe, Long> {

}
