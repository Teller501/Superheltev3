package com.example.springdemo2.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeMessage {
    private final String message = "Velkommen til KEA";
    private int id;

    public String getWelcomeMessage(int id) {
        return message + id;
    }
}
