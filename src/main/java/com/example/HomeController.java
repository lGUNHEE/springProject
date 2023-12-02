package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {



    @RequestMapping("/")   //url 등록
    public String home(){
        System.out.println("home~~");
        return "test";   //view의 이름 -> view resolver와 합쳐저야 함.
    }



}
