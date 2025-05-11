package com.project.pgmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.ApprovedBooking;
import com.project.pgmanagementsystem.repository.ApprovedBookingRepository;

@Service
public class ApprovedBookingService {
	
	@Autowired
	private ApprovedBookingRepository approvedBookingRepository;
	
	public List<ApprovedBooking> getAllBookings() {
        return approvedBookingRepository.findAll();
      }
}	

