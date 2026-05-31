package com.boulangerie.site.controller;

import com.boulangerie.site.controller.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AvisController {

    @Autowired
    private EmailService emailService;

    // PAGE AVIS
    @GetMapping("/avis")
    public String pageAvis() {
        return "avis";
    }

    // ENVOI AVIS
    @PostMapping("/avis")
    public String envoyerAvis(@RequestParam int note,
                              @RequestParam String message) {

        String contenu = "NOUVEL AVIS CLIENT\n\n"
                + "Note : " + note + "/5\n"
                + "Message : " + message;

        emailService.envoyer("acerbis.leo@gmail.com", "Avis client", contenu);

        return "redirect:/avis?success";
    }

    // PAGE CONTACT
    @GetMapping("/contact")
    public String pageContact() {
        return "contact";
    }

    // ENVOI CONTACT
    @PostMapping("/contact")
    public String envoyerContact(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String message) {

        String contenu = "NOUVEAU MESSAGE CONTACT\n\n"
                + "Nom : " + name + "\n"
                + "Email : " + email + "\n"
                + "Message : " + message;

        emailService.envoyer("acerbis.leo@gmail.com", "Contact site web", contenu);

        return "redirect:/contact?success";
    }
}