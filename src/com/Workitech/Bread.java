package com.Workitech;

public class Bread extends ProductForSale {
    private boolean isItHealty;

    public Bread(String name, int price, boolean isItHealty, String description) {
        super(name, price, description);
        this.isItHealty = isItHealty;
    }

    public void showDetails() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Is it healty: " + getIsItHealty());
        System.out.println("Description: " + getDescription());

    }

    public boolean getIsItHealty() {
        return isItHealty;
    }
}
