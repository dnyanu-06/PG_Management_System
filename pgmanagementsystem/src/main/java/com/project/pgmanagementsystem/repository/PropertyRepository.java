package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.PropertyEnter;

public interface PropertyRepository extends JpaRepository<PropertyEnter, Long> {
}
