package com.workintech.products;

public class Coke extends ProductForSale {
    private double sugarQuantity;

    public Coke(String type, double price, String description, double sugarQuantity) {
        super(type, price, description);
        this.sugarQuantity = sugarQuantity;
    }

    @Override
    public void showDetails() {
        System.out.println("cokes'sugar quantity is "+sugarQuantity+" grams");
    }
}
