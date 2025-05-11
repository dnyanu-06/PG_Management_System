package com.project.pgmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.pgmanagementsystem.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer>{

}
