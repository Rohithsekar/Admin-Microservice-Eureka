package com.rohi.admin.microservice.controller;

import com.rohi.admin.microservice.dto.APIResponse;
import com.rohi.admin.microservice.dto.AddProductDTO;
import com.rohi.admin.microservice.service.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    @RequestMapping("/add/product")
    public ResponseEntity<APIResponse> addProduct(@RequestBody @Valid AddProductDTO addProductDTO){
        return adminService.addProduct(addProductDTO);
    }

}
