package com.project.pgmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.pgmanagementsystem.entity.UserDetails;
import com.project.pgmanagementsystem.service.UserDetailsService;

@Controller
public class UserDetailsController {
	
	@Autowired
	private UserDetailsService userDetailsService;

	public void setUserDetailsService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}
	
	@GetMapping("/guest")
	public String getForm(Model model) {
		model.addAttribute("regi",new UserDetails());
		return "profile";
	}
	
	@PostMapping("/submit")
	public String submitForm(@ModelAttribute("regi") UserDetails userDetails) {
		userDetailsService.saveUserDetails(userDetails);
		return "profile";
	}
	

}
