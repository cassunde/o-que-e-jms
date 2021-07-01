package com.cassunde.jms.receive;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "queue.sample")
    public void receiveMessage(String email){
        System.out.println("received "+email);
    }
}
