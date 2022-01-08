package com.example.springjpa3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* IDENTITYテーブルと番号を一致させる */
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String name;

    @ManyToOne /* 多対１のテーブルを指定する */
    private Department department;
}
