package com.jun.practice.inheritance;

import com.jun.practice.person.Person;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    public void some(Person P){

    }

}