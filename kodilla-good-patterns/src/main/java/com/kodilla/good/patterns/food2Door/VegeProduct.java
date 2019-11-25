package com.kodilla.good.patterns.food2Door;

public class VegeProduct extends Product {
    private boolean glutenFree;

    public VegeProduct(String productName, boolean glutenFree) {
        super(productName);
        this.glutenFree = glutenFree;
    }
}
