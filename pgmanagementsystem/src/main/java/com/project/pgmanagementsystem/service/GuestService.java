package com.project.pgmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.Guest;
import com.project.pgmanagementsystem.repository.GuestRepository;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public String registerGuest(Guest guest) {
        // Check if the email already exists
        if (guestRepository.findByEmail(guest.getEmail()) != null) {
            return "This email is already registered!";
        }

        // Save the guest if email does not exist
        guestRepository.save(guest);
        return "Guest registered successfully!";
    }

    public Guest findByEmail(String email) {
        return guestRepository.findByEmail(email);
    }
}
