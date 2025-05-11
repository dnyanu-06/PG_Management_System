package com.project.pgmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.Owner;
import com.project.pgmanagementsystem.repository.OwnerRepository;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public String registerOwner(Owner owner) {
        // Check if the email already exists
        if (ownerRepository.findByEmail(owner.getEmail()) != null) {
            return "Email already registered! Please use a different email.";
        }
        ownerRepository.save(owner);
        return "Owner registered successfully!";
    }

    public Owner findByEmail(String email) {
        return ownerRepository.findByEmail(email);
    }
}
