package com.jun.practice.inheritance;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock
    BusinessMan businessMan;
    @BeforeEach
    void setUp() {
        businessMan = new BusinessMan("Google", "CEO");
        businessMan.setName("이순신");
    }
    @DisplayName("상속 예제")
    @Test
    public void test_showName(){
        assertEquals("이순신", businessMan.getName());
        assertEquals("Google", businessMan.getCompany());
        assertEquals("CEO", businessMan.getPosition());
    }

}