package com.project.pgmanagementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.Admin;
import com.project.pgmanagementsystem.repository.AdminRepository;

import jakarta.annotation.PostConstruct;

@Service
public class AdminDetailsService {

    @Autowired
    private AdminRepository adminRepository;

    // ✅ Ensure default admin is created on startup
    @PostConstruct
    public void initializeAdmin() {
        if (!adminRepository.existsByEmail("admin123@gmail.com")) {
            Admin admin = new Admin();
            admin.setEmail("admin123@gmail.com");
            admin.setPassword("admin"); // Consider encoding this password for security
            adminRepository.save(admin);
        }
    }

    // ✅ Validate admin login
    public boolean validateAdmin(String email, String password) {
        Optional<Admin> admin = adminRepository.findByEmail(email);
        return admin.isPresent() && admin.get().getPassword().equals(password);
    }

    // ✅ Get admin details by email
    public Admin getAdminDetails(String email) {
        return adminRepository.findByEmail(email).orElse(null);
    }
}

