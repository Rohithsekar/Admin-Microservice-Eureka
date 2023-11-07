package com.rohi.admin.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class APIResponse {

    private String status;
    private String message;
    private Object response;

    public APIResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
