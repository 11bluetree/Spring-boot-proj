package com.example.springioc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Coffe {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
