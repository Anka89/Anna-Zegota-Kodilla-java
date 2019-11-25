package com.kodilla.good.patterns.food2Door;
import java.util.Map;

public interface FoodShop {

        boolean process(Customer customer, Map<Product, Integer> productsOrders);
    }
