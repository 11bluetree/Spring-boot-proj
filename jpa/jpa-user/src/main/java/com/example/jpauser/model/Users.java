package com.example.jpauser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER")
    @NotNull
    @Size(max = 30, min = 4)  // @Rangeは整数ようだよ！
    private String user;

    @Column(name = "PASSWORD")
    @NotNull
    @Size(max = 20, min = 4)
    private String password;

}
