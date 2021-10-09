package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String nicetomeetyou(Model model){
        model.addAttribute("username","봉현");
        return "greetings"; //template/greetings.mustatche ->  브라우저로 이동
    }
    @GetMapping("/bye")
    public String seeyounext(Model model){
        model.addAttribute("nickname","이주니");
        return  "goodbye";
    }
}
