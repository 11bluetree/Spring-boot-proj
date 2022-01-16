package com.example.springsercurity1.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitApp implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        extracted();
        
    }

    private void extracted() {
        System.out.println("一番最初の処理です。");
    }
    
}
