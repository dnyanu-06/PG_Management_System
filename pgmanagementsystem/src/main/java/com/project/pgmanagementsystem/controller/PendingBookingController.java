package com.project.pgmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.pgmanagementsystem.entity.PendingBooking;
import com.project.pgmanagementsystem.service.PendingBookingService;

@Controller
public class PendingBookingController {
	
	@Autowired
	private PendingBookingService pendingBookindService;
	
	 @GetMapping("/pendingbooking")
	    public String viewBookings(Model model) {
	        List<PendingBooking> bookings = pendingBookindService.getAllBookings();
	        model.addAttribute("Pendinbooking", bookings); // Corrected key name
	        return "pendingBookings";
	    }


}
