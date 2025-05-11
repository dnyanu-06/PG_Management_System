package com.project.pgmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnalyticsController {

    @GetMapping("/admin/analytics")
    public String showAnalytics(Model model) {
        // Dummy data for system analytics
        int totalProperties = 120;
        int totalUsers = 450;
        int activeListings = 80;

        // Add dummy data to the model
        model.addAttribute("totalProperties", totalProperties);
        model.addAttribute("totalUsers", totalUsers);
        model.addAttribute("activeListings", activeListings);

        return "system-analytics";
    }
}

