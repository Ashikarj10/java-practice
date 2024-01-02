package edu.training.productService.dbo;

import lombok.AllArgsConstructor;

import lombok.Builder;

import lombok.Data;

import lombok.NoArgsConstructor;

 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductReq {
    private String pName;
    private Double price;
    private Integer quantity;
}
