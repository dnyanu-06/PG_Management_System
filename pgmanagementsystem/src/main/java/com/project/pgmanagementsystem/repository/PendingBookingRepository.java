package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.PendingBooking;

public interface PendingBookingRepository extends JpaRepository<PendingBooking,Integer>{

}
