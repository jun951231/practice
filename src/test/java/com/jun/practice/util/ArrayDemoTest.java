package com.jun.practice.util;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock
    ArrayDemo array;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        array = new ArrayDemo();
    }

    @Test
    void test_fill() {
        String s = "";
        int[] arr = array.fill(7);
        for (int i: arr) {
            s += i;
        }
        assertEquals("77777", s);
    }

    @Test
    void test_copy() {
        String s = "";
        int[] arr = array.copy(new int[]{7, 7, 7, 7, 7}, 0 , 2, 2);
        for(int i: arr){
            s += i;
        }
        assertEquals("00770", s);
    }
    @Test
    void test_createIntegerArray(){
        int[] arr = array.createIntegerArray(1, 6);
        String s = "";
        for(int i: arr){
            s += i;
        }
        assertEquals("12345", s);
    }
}