package com.kodilla.good.patterns.food2Door;
import java.util.Map;

    public class OrderRequest {
        private Customer customer;
        private FoodShop foodShop;
        private Map<Product, Integer> productOrderRequest;


        public OrderRequest(Customer customer, FoodShop foodShop, Map<Product, Integer> productOrderRequest) {
            this.customer = customer;
            this.foodShop = foodShop;
            this.productOrderRequest = productOrderRequest;
        }

        public Customer getCustomer() {
            return customer;
        }

        public FoodShop getFoodShop() {
            return foodShop;
        }

        public Map<Product, Integer> getProductOrderRequest() {
            return productOrderRequest;
        }
    }

