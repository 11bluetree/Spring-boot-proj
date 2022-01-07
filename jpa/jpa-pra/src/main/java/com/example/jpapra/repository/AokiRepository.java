package com.example.jpapra.repository;


import com.example.jpapra.model.Aoki;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AokiRepository extends JpaRepository<Aoki,Integer>{
    
}
