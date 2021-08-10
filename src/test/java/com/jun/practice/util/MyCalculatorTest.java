package com.jun.practice.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {

    @Mock
    MyCalculator cal;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        cal = new MyCalculator();
    }

    @Test
    void plus() {
        assertEquals(5, cal.plus(2, 3));
    }
    @Test
    void minus(){
        assertEquals(2, cal.minus(5,3));
    }
    @Test
    void time() {
        assertEquals(9, cal.time(3, 3));
    }
    @Test
    void divide() {
        assertEquals(4, cal.divide(12, 3));
    }
}