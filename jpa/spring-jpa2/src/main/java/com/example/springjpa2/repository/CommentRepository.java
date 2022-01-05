package com.example.springjpa2.repository;

import com.example.springjpa2.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // レポジトリクラスであることを宣言
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
