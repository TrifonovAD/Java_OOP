package homework1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrink extends VendingMachineDrink {

    List<HotDrink> hotDrinks = new ArrayList<>();


    public String getProduct(String name) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name)) {
                return hotDrink.toString();
            }
        }
        return "Not found!";
    }

    public String getProduct(double volume) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getVolume() == volume) {
                return hotDrink.toString();
            }
        }
        return "Not found!";
    }

    public String getProduct(int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getTemperature() == temperature) {
                return hotDrink.toString();
            }
        }
        return "Not found!";
    }


    public void addProduct(String name, double cost, double volume, int temperature) {
        HotDrink hotDrink = new HotDrink(name, cost, volume, temperature);
        hotDrinks.add(hotDrink);
    }
}
