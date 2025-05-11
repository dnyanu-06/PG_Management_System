package com.project.pgmanagementsystem.entity;


public class Property {

    private String name;
    private String location;
    private int price;
    private String status;  // Available or Rented

    public Property(String name, String location, int price, String status) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.status = status;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}

