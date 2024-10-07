package com.example.danafood.service.mailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {
    @Autowired
    private JavaMailSender javaMailSender;



}
