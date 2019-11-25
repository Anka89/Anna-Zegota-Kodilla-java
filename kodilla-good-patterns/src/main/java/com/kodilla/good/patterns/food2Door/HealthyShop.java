package com.kodilla.good.patterns.food2Door;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements FoodShop {
        private Map<Product, Integer> productsList;


        private Map<Product, Integer> createProductListForHealthyShop() {

            Map<Product, Integer> productsList = new HashMap<>();

            productsList.put(new ProteinProduct("Omlette", 234), 3);
            productsList.put(new ProteinProduct("Biscuit",  150), 15);
            productsList.put(new VegeProduct("Falafelle", false), 2);
            productsList.put(new VegeProduct("Cookies", true), 4);

            return productsList;
        }

        public HealthyShop() {
             productsList = createProductListForHealthyShop();
        }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productsOrders) {
        return (productsOrders.size() >= 1 && isProductsAvailable(productsOrders));
    }

    private boolean isProductsAvailable(Map<Product, Integer> productsOrders) {
        for (Map.Entry<Product, Integer> entry : productsOrders.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("Healthy Shop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        System.out.println("You can buy it");
        return true;
    }
}
