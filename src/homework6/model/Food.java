package homework6.model;

import java.util.Map;

public class Food extends Product{
    private double weight;
    public Food(Map<String, Object> productInfo) {
        super(productInfo);
        this.weight = (double) productInfo.get("weight");
    }
}
