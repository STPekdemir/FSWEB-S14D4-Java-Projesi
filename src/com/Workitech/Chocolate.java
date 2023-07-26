package com.Workitech;

public class Chocolate extends ProductForSale {
    private boolean isItDark;

    public Chocolate(String name, int price, boolean isItDark, String description) {
        super(name, price, description);
        this.isItDark = isItDark;
    }

    public void showDetails() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Is it Dard: " + getisItDark());
        System.out.println("Description: " + getDescription());

    }

    public boolean getisItDark() {
        return isItDark;
    }
}
