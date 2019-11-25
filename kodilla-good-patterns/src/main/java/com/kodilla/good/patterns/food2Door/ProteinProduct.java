package com.kodilla.good.patterns.food2Door;

public class ProteinProduct extends Product {
    private int proteinContetnt;

    public ProteinProduct(String productName, int proteinContetnt) {
        super(productName);
        this.proteinContetnt = proteinContetnt;
    }
}
