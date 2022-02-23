package com.example.thetabloid.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller                         //Bruger @Controller, da vi skal returnere html filer
public class IndexController {

    @GetMapping("/")
    public String newsFromIndex (){
        return "index";             //returnere html fil navnet
    }
}
