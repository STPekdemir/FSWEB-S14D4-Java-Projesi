package com.Workitech;

public class Coke extends ProductForSale {
    private int sugarPerLiter;

    public Coke(String name, int price, int sugarPerLiter, String description) {
        super(name, price, description);
        this.sugarPerLiter = sugarPerLiter;
    }

    public void showDetails() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Sugar Per Liter: " + getSugarPerLiter());
        System.out.println("Description: " + getDescription());

    }

    public int getSugarPerLiter() {
        return sugarPerLiter;
    }

}
