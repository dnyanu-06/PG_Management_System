package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    Guest findByEmail(String email);
}
