package homework4;

public class HotDrink extends Drink {
    private int temperature;


    public HotDrink(String name, int cost, Double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%s. Temperature %d", super.toString(), temperature);
    }
}
