package homework6.model;

import java.util.Map;

public abstract class Product {
    protected String name;
    protected Integer cost;

    public Product(Map<String, Object> productInfo) {
        this.name = (String) productInfo.get("name");
        this.cost = (Integer) productInfo.get("cost");
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

    public boolean isMatch(Map<String, Object> findObj) {
        boolean findByCost = !findObj.containsKey("cost") || findObj.containsKey("cost")
                && (findObj.get("cost") instanceof Integer) && ((Integer) findObj.get("cost")).equals(cost);
        boolean findByName = !findObj.containsKey("name") || findObj.containsKey("name")
                && (findObj.get("name") instanceof String) && ((String) findObj.get("name")).equals(name);

        return findByCost && findByName;
    }
}