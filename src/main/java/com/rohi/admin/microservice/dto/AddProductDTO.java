package com.rohi.admin.microservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddProductDTO {

    @NotNull(message = "product name cannot be empty")
    private String name;

    @NotNull(message = "category cannot be empty")
    private String category;

    @NotNull(message = "price field cannot be empty")
    private Double price;
}
