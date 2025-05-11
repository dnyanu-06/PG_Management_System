package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.RejectedBooking;

public interface RejectedBookingRepository extends JpaRepository<RejectedBooking,Integer>{

}
