package com.kodilla.good.patterns.food2Door;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements FoodShop {

        private Map<Product, Integer> productsList;

        private Map<Product, Integer> createListForExtraFoodShoop() {
            Map<Product, Integer> productsList = new HashMap<>();

            productsList.put(new ProteinProduct("Goat Chees",120), 15);
            productsList.put(new ProteinProduct("Oak Milk",90), 7);
            productsList.put(new VegeProduct("Coconut Yougurth", true), 20);
            productsList.put(new VegeProduct("Bacon Tasting chips", false), 0);

            return productsList;
        }

         public ExtraFoodShop() {
             productsList = createListForExtraFoodShoop();
         }

        @Override
        public boolean process(Customer customer, Map<Product, Integer>productsOrder) {
            for(Map.Entry<Product, Integer> entry : productsOrder.entrySet()) {
                Optional<Integer> productQuantity = Optional.ofNullable(productsList.get(entry.getKey()));
                if(productQuantity.orElse(0) < entry.getValue()) {
                    System.out.println("Wa are so sorry, but the product you have chosen is unavailable");
                    return false;
                }
            }
            return true;
        }
    }
