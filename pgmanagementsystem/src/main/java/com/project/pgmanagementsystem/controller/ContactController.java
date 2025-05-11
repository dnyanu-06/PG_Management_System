package com.project.pgmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pgmanagementsystem.entity.ContactForm;
import com.project.pgmanagementsystem.service.EmailService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public String handleContactForm(@RequestBody ContactForm form) {
        emailService.sendEmail(form.getName(), form.getEmail(), form.getMessage());
        return "Message sent successfully!";
    }
}
