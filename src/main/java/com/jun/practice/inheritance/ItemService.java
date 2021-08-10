package com.jun.practice.inheritance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
}