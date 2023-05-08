package homework6.model;

import java.util.Map;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(Map<String, Object> productInfo) {
        super(productInfo);
        this.temperature = (int) productInfo.get("temp");
    }

    @Override
    public String toString() {
        return String.format("%s Температура %d", super.toString(), temperature);
    }
}
