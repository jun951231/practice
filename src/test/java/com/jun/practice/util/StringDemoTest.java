package com.jun.practice.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class StringDemoTest {
    @Mock
    StringDemo demo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        demo = new StringDemo();
    }

    @Test
    void concat() {
        assertEquals("CoffeeBread", demo.concat("Coffee", "Bread"));
    }
    @Test
    void substring(){
        assertEquals("cdefg", demo.substring("abcdefg", 2));
    }
    @Test
    void testSubstring(){
        assertEquals("cde", demo.testSubstring("abcdefg", 2,5));
    }
    @Test
    void compareTo(){
        assertEquals(0, demo.compareTo("abc", "abc"));
    }
    @Test
    void compareToIgnoreCase(){
        assertEquals(1, demo.compareToIgnoreCase("abc", "ABC"));

    }
    @Test
    void removeHyponeInJuminBunho(){
        assertEquals("", demo.removeHyponeInJuminBunho(""));
    }

}