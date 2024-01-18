package com.workintech.products;

public class Chocolate extends ProductForSale{
    private double cacaoPercentage;

    public Chocolate(String type, double price, String description, double cacaoPercentage) {
        super(type, price, description);
        this.cacaoPercentage = cacaoPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("chocolates' cacao percentage is %"+cacaoPercentage);
    }
}
