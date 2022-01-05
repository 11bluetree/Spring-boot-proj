package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  // データの入れ物となることを宣言
public class Book {
    @Id // 主キーとなる
    @GeneratedValue // キーの自動採番
    private Long id;

    private String title;
    private String detail;

}
