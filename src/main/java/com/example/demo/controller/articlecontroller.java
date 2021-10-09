package com.example.demo.controller;

import com.example.demo.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class articlecontroller {

    @GetMapping("/articles/new")
    public String newarticles(){
        return "articles/new";
    }

    @PostMapping("/articles/new")
    public String createarticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }}
