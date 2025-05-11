package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByEmail(String email);
}
