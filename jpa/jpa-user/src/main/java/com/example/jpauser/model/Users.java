package com.example.jpauser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue
    // @Column(name = "ID")
    private Long id;

    // @Column(name = "USER")
    // @NotNull
    // @Range(max = 30, min = 6)
    private String user;

    // @Column(name = "PASSWORD")
    // @NotNull
    // @Range(max = 20, min = 8)
    private String password;

}
