package com.jun.practice.product.controller;

import com.jun.practice.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

}