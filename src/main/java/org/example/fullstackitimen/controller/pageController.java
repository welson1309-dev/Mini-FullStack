package org.example.fullstackitimen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class pageController {

    @GetMapping("/quotes")
    public String getQuotes(){
        return"quotes";
    }

    @PostMapping("/quotes")
    public String postQuotes(){

        return"redirect:/quotes";
    }
}
