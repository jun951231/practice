package com.jun.practice.product.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ProductDto {
    @Id
    private long itemId;
}