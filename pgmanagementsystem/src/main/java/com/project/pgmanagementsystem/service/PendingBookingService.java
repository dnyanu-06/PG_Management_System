package com.project.pgmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.pgmanagementsystem.entity.PendingBooking;
import com.project.pgmanagementsystem.repository.PendingBookingRepository;

@Service
public class PendingBookingService {
	
	@Autowired
	private PendingBookingRepository pendingBookingRepository;
	
	public List<PendingBooking> getAllBookings() {
        return pendingBookingRepository.findAll();
    }

}
