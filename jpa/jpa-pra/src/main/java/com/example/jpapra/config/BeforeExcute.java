package com.example.jpapra.config;

import com.example.jpapra.model.Haru;
import com.example.jpapra.repository.HaruRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component // この部品宣言が大事なんよ
@RequiredArgsConstructor
public class BeforeExcute implements ApplicationRunner{

    private final HaruRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("先の処理");
        
        Haru haru = new Haru(); 
        haru.setName("治人");
        repository.save(haru);
    }
    
}
