package com.gfa.exam.candy_shop;

public class HardCandy extends Candy {

    private final int amountOfSugar;
    private double price;

    public HardCandy() {
        this.price = 4.0;
        this.amountOfSugar = 80;
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
