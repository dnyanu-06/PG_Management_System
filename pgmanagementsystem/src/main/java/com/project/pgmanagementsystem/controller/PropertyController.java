package com.project.pgmanagementsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pgmanagementsystem.entity.Property;

@Controller
@RequestMapping("/admin")
public class PropertyController {

//    @GetMapping("/admin/properties")
//    public String manageProperties(Model model) {
//        // Dummy list of properties (replace with actual database logic)
//        List<Property> properties = Arrays.asList(
//            new Property("Property 1", "Location A", 1200, "Available"),
//            new Property("Property 2", "Location B", 1500, "Rented"),
//            new Property("Property 3", "Location C", 1000, "Available"),
//            new Property("Property 4", "Location D", 1800, "Rented")
//        );
//
//        // Add properties to the model
//        model.addAttribute("properties", properties);
//
//        return "manage-properties";  // Thymeleaf template name
//    }
	
	
	    @GetMapping("/manage-properties")
	    public String manageProperties(Model model) {
	    	List<Property> properties = Arrays.asList(
	              new Property("Property 1", "Location A", 1200, "Available"),
	              new Property("Property 2", "Location B", 1500, "Rented"),
	              new Property("Property 3", "Location C", 1000, "Available"),
	              new Property("Property 4", "Location D", 1800, "Rented")
	          );
	  
	          // Add properties to the model
	          model.addAttribute("properties", properties);
	        return "manage-properties"; // This should return the name of the view (Thymeleaf template)
	    }
	}


