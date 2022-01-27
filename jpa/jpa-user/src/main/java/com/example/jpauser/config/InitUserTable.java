package com.example.jpauser.config;

import com.example.jpauser.model.Users;
import com.example.jpauser.repository.UsersRepository;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Component
public class InitUserTable implements ApplicationRunner {

    private final UsersRepository userRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("青木");
        var user = "aokiiiii";
        var password = "123haruiii";

        Users users = new Users();
        users.setUser(user);
        users.setPassword(password);

        System.out.println(users.getUser());

        userRepo.save(users);
        
    }

}
