package com.boulangerie.site.controller;

import org.springframework.stereotype.*;
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

    @GetMapping("/pains")
    public String pains() {
        return "pains";
    }

    @GetMapping("/viennoiseries")
    public String viennoiseries() {
        return "viennoiseries";
    }

    @GetMapping("/patisseries")
    public String patisseries() {
        return "patisseries";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}