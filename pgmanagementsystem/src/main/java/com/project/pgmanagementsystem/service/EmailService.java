package com.project.pgmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String name, String email, String message) {
        String toEmail = "jadhavdnyaneshwari07@gmail.com"; // Change to your target email
        String subject = "New Contact Form Submission";

        String content = "Name: " + name + "\n" +
                         "Email: " + email + "\n" +
                         "Message: " + message;

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);

        mailSender.send(mailMessage);
    }
}

