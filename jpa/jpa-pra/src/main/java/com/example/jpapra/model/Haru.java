package com.example.jpapra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Haru {

    
    @Size(max = 10, min = 2)
    private String name;

    @Id
    @GeneratedValue
    private int number;
}
