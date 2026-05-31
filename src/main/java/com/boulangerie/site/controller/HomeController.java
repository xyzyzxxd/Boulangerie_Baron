package com.boulangerie.site.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/pains")
    public String pains() {
        return "pains";
    }

    @GetMapping("/sucre")
    public String sucre() {
        return "sucre";
    }

    @GetMapping("/sale")
    public String sale() {
        return "sale";
    }

}