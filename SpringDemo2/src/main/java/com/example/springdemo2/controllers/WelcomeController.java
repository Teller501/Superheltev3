package com.example.springdemo2.controllers;

import com.example.springdemo2.services.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("kea")
public class WelcomeController {

    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    @GetMapping(path = "velkommen/{id}")
    public ResponseEntity<String> sayWelcome(@PathVariable int id, @RequestParam(required = false) String caps) {
        String msg = welcomeService.getWelcomeMessage(id);
        if (caps != null && caps.equals("y")){
            msg = msg.toUpperCase();
        }
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
