package com.boulangerie.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

   @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/produits")
    public String produits() {
        return "produits";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}