package com.jun.practice.inheritance;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Man {
    private String name;
}

@Data
final class BusinessMan extends Man{
    private final String company;
    private final String position;
}