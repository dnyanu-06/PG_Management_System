package com.project.pgmanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PendingBooking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    
    private String property;
    private String name;
    private String location;
    private String owner;
    private String customer;
    private String roomType;
    private String roomNo;
    private LocalDate startDate;
    private LocalDate endDate;
    private int totalStay;
    private String action;

}

