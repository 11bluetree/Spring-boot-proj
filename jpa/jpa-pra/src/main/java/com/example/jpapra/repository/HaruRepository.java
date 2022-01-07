package com.example.jpapra.repository;

import com.example.jpapra.model.Haru;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HaruRepository extends JpaRepository<Haru, Integer> {

}
