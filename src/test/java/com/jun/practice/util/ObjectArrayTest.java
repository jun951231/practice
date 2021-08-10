package com.jun.practice.util;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class ObjectArrayTest {
    @Mock
    ObjectArray objectArray;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        objectArray = new ObjectArray();
    }

    @Test
    void createCart() {
        Product[] arr = objectArray.createCart();
        for(Product p: arr){
            System.out.println(p.toString());
        }
        assertEquals("Coffee", arr[0].getDescript());
    }
}