package com.kodilla.good.patterns.food2Door;

public class Product {
        private String productName;

        public Product(String productName) {
            this.productName = productName;
        }

        @Override
        public String toString() {
            return "productName='" + productName + '\'';
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product) || o==null) return false;

        Product product = (Product) o;

        return productName.equals( product.productName );
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }
}

