package com.example.jpapra.controller;

import com.example.jpapra.model.Aoki;
import com.example.jpapra.repository.AokiRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor // コンストラクタを自動生成しちゃうよ！！！　そして@Autowiredも省略可能→シングルコンストラクタは省略可だから
public class AokiController {
    
    private final AokiRepository repository;

    @GetMapping("/aoki")
    public String getAoki(Model model, @ModelAttribute("aoki") Aoki aoki){
        model.addAttribute("takashi", "青木です。");
        model.addAttribute("haru", repository.findAll());
        return "aoki";
    }

    @PostMapping("/aoki")
    public String postAoki(Model model, @ModelAttribute("aoki") @Validated Aoki aoki, BindingResult result){
        model.addAttribute("takashi", "青木です。");
        if(result.hasErrors()){
            return "aoki";
        }

        repository.save(aoki);
        model.addAttribute("haru", repository.findAll());

        return "aoki";
    }
}
