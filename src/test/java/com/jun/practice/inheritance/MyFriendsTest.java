package com.jun.practice.inheritance;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyFriendsTest {
    @Mock
    MyFriends friends;
    @BeforeEach
    void setUp() {
        friends = new MyFriends();
    }

    @Test
    void getFriends() {
        Friend[] returnfriends = friends.getFriends();
        for(Friend f : returnfriends){
            System.out.println(f.toString());
        }
        assertEquals("Yoon", returnfriends[2].getName());
    }
}