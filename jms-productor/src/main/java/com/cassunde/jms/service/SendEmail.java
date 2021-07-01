package com.cassunde.jms.service;

import com.cassunde.jms.vo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(Email email){
        jmsTemplate.convertAndSend("queue.sample", email.getBody());
        System.out.println("Enviado");
    }
}
