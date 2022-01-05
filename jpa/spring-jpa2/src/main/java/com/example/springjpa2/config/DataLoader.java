package com.example.springjpa2.config;

import com.example.springjpa2.model.Comment;
import com.example.springjpa2.repository.CommentRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // コンストラクタの自動生成→Finalなフィールドが対象
@Component
public class DataLoader implements ApplicationRunner /* ApplicationRunnerの継承で初期処理を実行をオーバーライド */{

    private final CommentRepository repository;

    // このアプリの初期処理を実行する
    @Override
    public void run(ApplicationArguments args) throws Exception{
        var comment = new Comment();
        comment.setContent("こんにちは");
        repository.save(comment);

        var testComment = new Comment();
        testComment.setContent("テストコメント");
        repository.save(testComment);
    }
    
}
