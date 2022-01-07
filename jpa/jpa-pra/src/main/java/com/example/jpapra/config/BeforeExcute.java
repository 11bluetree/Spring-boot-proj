package com.example.jpapra.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component // この部品宣言が大事なんよ
public class BeforeExcute implements ApplicationRunner{

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("先の処理");
        
    }
    
}
