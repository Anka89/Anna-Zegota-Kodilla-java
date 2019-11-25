package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer( "FITZONE", "Filip", "Kowalski");
        Map<Product, Integer> productsList = new HashMap<>();
        FoodShop foodShop = new HealthyShop();
        productsList.put(new ProteinProduct("Rice", 111), 2);
        productsList.put(new ProteinProduct("Nuts", 567), 3);
        productsList.put(new VegeProduct("Soya Milk", true), 10);

        orderRequestList.add(new OrderRequest(customer, foodShop, productsList));

        Customer customer1 = new Customer("FALAFEL", "Grażyna", "Księżycowa");
        Map<Product, Integer> productsList1 = new HashMap<>();
        FoodShop foodShop1 = new ExtraFoodShop();
        productsList1.put(new VegeProduct("Spaghetti", false), 2);
        productsList1.put(new VegeProduct("Bisquit", false), 3);
        productsList1.put(new VegeProduct("Coca cola", false), 1);

        orderRequestList.add(new OrderRequest(customer1, foodShop1, productsList1));

        return orderRequestList;
    }
}
