package homework1;

public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
