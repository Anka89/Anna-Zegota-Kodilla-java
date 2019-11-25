package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class OrderService {

    public void ordersToBePrepare(List<OrderRequest> orderRequest) {

        orderRequest.stream()
                .map(n -> {
                    System.out.println("We're processing your order " + n.getCustomer().getID());
                    return n.getFoodShop().process(n.getCustomer(), n.getProductOrderRequest());
                })
                .forEach(t -> System.out.println("Order finished with success: " + t + "\n"));
    }
}