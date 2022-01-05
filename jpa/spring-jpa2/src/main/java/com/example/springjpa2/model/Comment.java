package com.example.springjpa2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  // データの入れ物となることを宣言
public class Comment {
    @Id // 主キーとなる
    @GeneratedValue // キーの自動採番
    private Long id;

    @NotBlank
    @Size(max = 40) // つぶやきの長さを制限
    private String content;

}
