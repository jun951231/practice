package com.jun.practice.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.ApplicationRunner;

@RequiredArgsConstructor
@ToString
@Getter
class Product{
    private final int productId;
    private final String descript;
}

public class ObjectArray {
    public Product[] createCart(){
        Product[] cart = new Product[5];
        String[] productNames = {"Coffee", "Computer", "Apple", "Dress", "Fairy-tale book"};

        Product p1 = new Product(1, "Coffee");
        Product p2 = new Product(2, "Computer");
        Product p3 = new Product(3, "Apple");
        Product p4 = new Product(4, "Dress");
        Product p5 = new Product(5, "Fairy-tale book");

        for(int i=0; i< cart.length; i++){
            cart[i] = new Product(i + 1, productNames[i]);
        }
        return cart;
    }
}
/*for(int i=0; i< cart.length; i++){
            cart[i] = new Product(0, "");
            i++;
        }
        return cart;*/