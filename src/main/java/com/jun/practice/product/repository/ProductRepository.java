package com.jun.practice.product.repository;


import com.jun.practice.product.entity.ProductDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDto, Long> {
}