package task1_1;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private String getInfo() {
        return String.format("Product: %s, price %.2f", name, cost);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}