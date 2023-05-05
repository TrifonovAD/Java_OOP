package homework6.model;

public class Drink extends Product{
    protected Double volume;
    public Drink(String name, int cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f). Cost %d", name, volume, cost);
    }
}
