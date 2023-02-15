package com.example.springdemo2.services;

import com.example.springdemo2.repositories.WelcomeMessage;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    private WelcomeMessage message;

    public WelcomeService(WelcomeMessage message){
        this.message = new WelcomeMessage();
    }

    public String getWelcomeMessage(int id){
        return message.getWelcomeMessage(id);
    }
}
