package com.project.pgmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.pgmanagementsystem.entity.Location;
import com.project.pgmanagementsystem.service.LocationService;

@Controller
@RequestMapping("/admin/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public String showManageLocations(Model model) {
        model.addAttribute("locations", locationService.getAllLocations());
        return "admin/manage-locations";  // Ensure the path matches the file location
    }


    @PostMapping("/add")
    public String addLocation(@ModelAttribute Location location) {
        locationService.addLocation(location);
        return "redirect:/admin/locations";
    }

    @GetMapping("/delete/{id}")
    public String deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
        return "redirect:/admin/locations";
    }
}
