package com.example.springsercurity1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {

    @GetMapping("/")
    public String getHome() {
        // ルートでのログイン成功後デフォルトページは、successページにしかいかない仕様
        return "success";
    }

    @GetMapping("/home")
    public String getHome2() {
        // 別のURLでログインした場合は任意のページを表示できる
        return "home";
    }

}
