package com.gfa.exam.candy_shop;

import java.util.ArrayList;

public class CandyShop {

    private int sugar;
    private double income = 0.0;
    private final ArrayList<Candy> inventory = new ArrayList<>();

    public CandyShop( int amountOfSugar) {
        this.sugar = amountOfSugar;
    }

    public void storeCandy(Candy c) throws Exception {
        if ((c instanceof Lollipop && this.sugar - ((Lollipop) c).getAmountOfSugar() <= 0) || (c instanceof HardCandy && this.sugar - ((HardCandy) c).getAmountOfSugar() <= 0)) {
            throw new Exception("Insufficient sugar");
        } else {
            if (c instanceof Lollipop) {
                inventory.add(c);
                this.sugar = this.sugar - ((Lollipop) c).getAmountOfSugar();
            }
            if (c instanceof HardCandy) {
                inventory.add(c);
                this.sugar = this.sugar - ((HardCandy) c).getAmountOfSugar();
            }
        }
    }

    public void raisePrice(double amount) {
        for (Candy c : inventory) {
            if (c instanceof Lollipop) {
                double newPrice = ((Lollipop) c).getPrice() + amount;
                ((Lollipop) c).setPrice(newPrice);
            }
            if (c instanceof HardCandy) {
                double newPrice = ((HardCandy) c).getPrice() + amount;
                ((HardCandy) c).setPrice(newPrice);
            }
        }
    }

    public void sell(int amountOfCandiesToBeSold) {
            if (amountOfCandiesToBeSold > this.inventory.size()) {
                amountOfCandiesToBeSold = this.inventory.size();
            }
        for (int i = 0; i < amountOfCandiesToBeSold; i++) {
            Candy c = inventory.get(i);
            if (c instanceof Lollipop) {
                this.income += ((Lollipop) c).getPrice();
                inventory.remove(c);
            }
            if (c instanceof HardCandy) {
                this.income += ((HardCandy) c).getPrice();
                inventory.remove(c);
            }
        }
    }

    public void buySugar(int amount) throws Exception {
        if (this.income - amount * 2 < 0) {
            throw new Exception("Insufficient income");
        }
        this.sugar += amount * 1000;
        this.income -= (double)amount * 2;
    }

    @Override
    public String toString() {
        int hardCandies = 0;
        int lollipops = 0;
        for (Candy c : inventory) {
            if (c instanceof HardCandy) {
                hardCandies += 1;
            }
            if (c instanceof Lollipop) {
                lollipops += 1;
            }
        }
        return "Inventory: " + hardCandies + " hard candies, " + lollipops + " lollipops; Income: $" + this.income + "; Sugar: " + this.sugar + " grams";
    }
}
