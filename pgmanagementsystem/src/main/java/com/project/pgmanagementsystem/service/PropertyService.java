package com.project.pgmanagementsystem.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.pgmanagementsystem.entity.PropertyEnter;
import com.project.pgmanagementsystem.repository.PropertyRepository;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    // Add property with image upload
    public void addProperty(String name, String area, String city, double price, MultipartFile photo) throws IOException {
        PropertyEnter property = new PropertyEnter();
        property.setName(name);
        property.setArea(area);
        property.setCity(city);
        property.setPrice(price);
        
        propertyRepository.save(property);
    }


    // Get all properties
    public List<PropertyEnter> getAllProperties() {
        return propertyRepository.findAll();
    }

    // Delete property
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
