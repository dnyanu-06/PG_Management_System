package com.project.pgmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("adminUser")
public class AdminController {

    @GetMapping("/admin/admin-login")
    public String adminLogin() {
        return "admin-login";
    }

    @PostMapping("/admin/login")
    public String adminLogin(@RequestParam String username,
                             @RequestParam String password,
                             RedirectAttributes redirectAttributes,
                             HttpSession session) {
        // Hardcoded credentials for testing
        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("adminUser", "admin");
            return "redirect:/admin/dashboard";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid credentials. Try again!");
            return "redirect:/admin/admin-login";
        }
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard(HttpSession session) {
        // Check if admin is logged in
        if (session.getAttribute("adminUser") == null) {
            return "redirect:/admin/admin-login";
        }
        return "admin-dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "index";
    }
}
