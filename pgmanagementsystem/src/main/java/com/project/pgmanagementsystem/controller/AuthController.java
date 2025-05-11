package com.project.pgmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.pgmanagementsystem.entity.Guest;
import com.project.pgmanagementsystem.entity.Owner;
import com.project.pgmanagementsystem.service.AdminDetailsService;
import com.project.pgmanagementsystem.service.GuestService;
import com.project.pgmanagementsystem.service.OwnerService;

@Controller
public class AuthController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private GuestService guestService;
    
    @Autowired AdminDetailsService adminService;

    @PostMapping("/register-owner")
    public String ownerRegister(@ModelAttribute Owner owner, Model model) {
        // Check if owner email already exists
        if (ownerService.findByEmail(owner.getEmail()) != null) {
            model.addAttribute("error", "This email is already registered!");
            return "owner_register"; // Redirect to owner registration page with error
        }

        ownerService.registerOwner(owner);
        model.addAttribute("message", "Owner Registered Successfully");
        return "login";
    }

    @PostMapping("/register-guest")
    public String guestRegister(@ModelAttribute Guest guest, Model model) {
        // Check if guest email already exists
        if (guestService.findByEmail(guest.getEmail()) != null) {
            model.addAttribute("error", "This email is already registered!");
            return "guest_register"; // Redirect to guest registration page with error
        }

        guestService.registerGuest(guest);
        model.addAttribute("message", "Guest Registered Successfully");
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, Model model) {
        // ✅ Check if Admin is logging in
        if (adminService.validateAdmin(email, password)) {
            return "admin-dashboard"; // Redirect Admin to Dashboard
        }

        // ✅ Check Owner Login
        Owner owner = ownerService.findByEmail(email);
        if (owner != null && owner.getPassword().equals(password)) {
            return "owner_dashboard"; // Redirect to Owner Dashboard
        }

        // ✅ Check Guest Login
        Guest guest = guestService.findByEmail(email);
        if (guest != null && guest.getPassword().equals(password)) {
            return "guest_dashboard"; // Redirect to Guest Dashboard
        }

        // ✅ Invalid Credentials
        model.addAttribute("error", "Invalid credentials!");
        return "login"; // Return to login page with error message
    }

}
