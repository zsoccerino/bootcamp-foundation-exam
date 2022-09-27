package com.gfa.exam.candy_shop;

public class Lollipop extends Candy {

    private final int amountOfSugar;
    private double price;

    public Lollipop() {
        this.price = 2.0;
        this.amountOfSugar = 60;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
