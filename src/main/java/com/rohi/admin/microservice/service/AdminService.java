package com.rohi.admin.microservice.service;

import com.rohi.admin.microservice.dto.APIResponse;
import com.rohi.admin.microservice.dto.AddProductDTO;
import com.rohi.admin.microservice.model.Product;
import com.rohi.admin.microservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<APIResponse> addProduct(AddProductDTO addProductDTO){
        Product product = productRepository.save(new Product(addProductDTO.getName(), addProductDTO.getCategory(), addProductDTO.getPrice()));
        return ResponseEntity.status(HttpStatus.CREATED).body(new APIResponse("success", "Product added to database", product));
    }
}
