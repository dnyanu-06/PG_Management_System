package com.project.pgmanagementsystem.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.pgmanagementsystem.entity.PropertyEnter;
import com.project.pgmanagementsystem.service.PropertyService;

@Controller

public class OwnersController {

	private final PropertyService propertyService;

    public OwnersController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/properties")
    public String showProperties() {
        return "show-properties"; // This maps to show-properties.html in /templates
    }
    
    @GetMapping("/owner/dashboard")
    public String showDashboard(Model model) {
        System.out.println("Loading Owner Dashboard...");  // Debug log
        List<PropertyEnter> properties = propertyService.getAllProperties();
        model.addAttribute("properties", properties);
        return "owner_dashboard";  
    }

    // Add Property
    @PostMapping("/owner/addProperty")
    public String addProperty(@RequestParam("name") String name,
                              @RequestParam("area") String area,
                              @RequestParam("city") String city,
                              @RequestParam("price") double price,
                              @RequestParam("photo") MultipartFile photo) throws IOException {
        propertyService.addProperty(name, area, city, price, photo);
        return "redirect:/owner/dashboard"; 
    }

    // Delete Property
    @GetMapping("/deleteProperty/{id}")
    public String deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
        return "redirect:/owner/dashboard";
    }
}
