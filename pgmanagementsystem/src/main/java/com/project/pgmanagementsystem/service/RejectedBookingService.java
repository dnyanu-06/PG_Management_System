package com.project.pgmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.RejectedBooking;
import com.project.pgmanagementsystem.repository.RejectedBookingRepository;

@Service
public class RejectedBookingService {
	
	@Autowired
	private RejectedBookingRepository rejectedBookingRepository;
	
	public List<RejectedBooking> getAllBookings() {
        return rejectedBookingRepository.findAll();

	}
}
