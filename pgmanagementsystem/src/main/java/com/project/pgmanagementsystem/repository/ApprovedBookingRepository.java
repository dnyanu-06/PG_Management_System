package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.ApprovedBooking;

public interface ApprovedBookingRepository extends JpaRepository<ApprovedBooking,Integer>{

}
