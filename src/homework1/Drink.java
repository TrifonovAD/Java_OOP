package homework1;

import task1_2.Product;

public class Drink extends Product {
    private double volume;


    public Drink(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + "), cost: " + cost;
    }
}
