package com.project.pgmanagementsystem.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class UserDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String age;
	
	private String profession;
	
	private String address;
	
	private byte[]photo;

}
