package com.Workitech;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    // write constructor
    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity) {
        return price * quantity;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void showDetails();
}
