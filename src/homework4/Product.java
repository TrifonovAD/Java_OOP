package homework4;

public abstract class Product {
    protected String name;
    protected int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        if (cost > 0) this.cost = cost;
        else System.out.println("Wrong cost!");
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " стоит " + cost + " руб.";
    }
}
