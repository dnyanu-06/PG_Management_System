package com.project.pgmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.pgmanagementsystem.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}

