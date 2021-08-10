package com.jun.practice.product.service;


import com.jun.practice.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ProductServiceImpl{ //implements ProductService{
    private final ProductRepository productRepository;
}