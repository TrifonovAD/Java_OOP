package homework6.model;

import java.util.Map;

public class Drink extends Product{
    protected Double volume;

    public Drink(Map<String, Object> productInfo) {
        super(productInfo);
        this.volume = (Double) productInfo.get("volume");
    }


    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s (%.2f). Стоит %d руб.", name, volume, cost);
    }
}
