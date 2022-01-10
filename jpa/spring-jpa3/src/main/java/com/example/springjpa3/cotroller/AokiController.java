package com.example.springjpa3.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AokiController {

    @GetMapping("/aoki")
    public String getAoki(Model model) {
        model.addAttribute("sample","sample");
        return "aoki";
    }
}
