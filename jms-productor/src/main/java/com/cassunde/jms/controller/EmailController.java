package com.cassunde.jms.controller;

import com.cassunde.jms.service.SendEmail;
import com.cassunde.jms.vo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    SendEmail emailSender;

    @PostMapping
    public ResponseEntity send(@RequestBody Email email){
        emailSender.send(email);
        return ResponseEntity.ok().build();
    }
}
