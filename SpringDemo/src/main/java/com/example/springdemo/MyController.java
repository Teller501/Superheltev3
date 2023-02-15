package com.example.springdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("bye")
    public ResponseEntity<String> sayGoodbye(){
        return new ResponseEntity<>("Goodbye World", HttpStatus.OK);
    }

    @GetMapping("hello/{id}")
    public ResponseEntity<String> helloByPath(@PathVariable String id){
        return new ResponseEntity<>("Hello " + id, HttpStatus.OK);
    }

    @GetMapping("hej")
    public ResponseEntity<String> sayHello2(@RequestParam String id){
        return new ResponseEntity<>("Hello " + id, HttpStatus.OK);
    }

    @GetMapping(path="velkommen/{id}")
    public ResponseEntity<String> sigVelkommen(@PathVariable int id) {
        String message =
                "";
        if (id == 1) {
            message = "Velkommen til KEA 1. semester";
        } else {
            message = "Velkommen til KEA 2. semester";
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping(path="velkommen2")
    public ResponseEntity<String> sigVelkommen2(@RequestParam int id) {
        String message =
                "";
        if (id == 1) {
            message = "Velkommen til KEA 1. semester";
        } else {
            message = "Velkommen til KEA 2. semester";
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping(path="velkommen3")
    public ResponseEntity<String> sigVelkommen3(@RequestParam int id,
                                                @RequestParam(required = false) String caps) {
        String message = "";
        if (id == 1) {
            message = "Velkommen til KEA 1. semester";
        } else {
            message = "Velkommen til KEA 2. semester";
        }
        if (caps != null && caps.equals("j")) {
            message = message.toUpperCase();
        }
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
