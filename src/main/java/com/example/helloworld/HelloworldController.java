package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworldController{

    @GetMapping("/name")
    public String getName(){
        return "Sneha";
    }


}
