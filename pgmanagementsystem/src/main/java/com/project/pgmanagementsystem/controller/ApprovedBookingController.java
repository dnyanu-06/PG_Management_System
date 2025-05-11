package com.project.pgmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.pgmanagementsystem.entity.ApprovedBooking;
import com.project.pgmanagementsystem.service.ApprovedBookingService;

public class ApprovedBookingController {
	
	@Autowired
	private ApprovedBookingService approvedBookingService;
	
	 @GetMapping("/approvedbooking")
	    public String viewBookings(Model model) {
	        List<ApprovedBooking> bookings = approvedBookingService.getAllBookings();
	        model.addAttribute("PendingBooking", bookings); // Corrected key name
	        return "approvedBooking";
	       }
}
