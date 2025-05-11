package com.project.pgmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.pgmanagementsystem.entity.RejectedBooking;
import com.project.pgmanagementsystem.service.RejectedBookingService;

@Controller
public class RejectedBookingController {
	
	@Autowired
	private RejectedBookingService rejectedBookingService;
	
	 @GetMapping("/rejectedbooking")
	    public String viewBookings(Model model) {
	        List<RejectedBooking> bookings = rejectedBookingService.getAllBookings();
	        model.addAttribute("RendinBooking", bookings); // Corrected key name
	        return "rejectedBookings";
	        }

}