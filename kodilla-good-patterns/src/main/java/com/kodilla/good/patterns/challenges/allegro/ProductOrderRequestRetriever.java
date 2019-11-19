package com.kodilla.good.patterns.challenges.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Skakanka", "Anna", "Nowak");
        LocalDateTime orderDate = LocalDateTime.of(2019, 11, 19, 15, 55);
        Product product = new Bicycle("BMX",
                "The bike will take you everywhere",
                new BigDecimal("1000"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                " Date: " + orderDate + "\n" +
                product + ", quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}