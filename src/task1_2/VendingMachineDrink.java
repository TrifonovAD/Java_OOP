package task1_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineDrink implements VendingMachine {

    List<Drink> drinks = new ArrayList<>();

    @Override
    public Product getProductByName(String name){
        for (Product product : drinks) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return new Drink("Not found!", 0, 0);
    }

    @Override
    public Product getProductByPrice(double cost) {
        for (Product product : drinks) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return new Drink("Not found!", 0, 0);
    }
    public void addDrink(String name, double cost, double volume) {
        Drink drink = new Drink(name, cost, volume);
        drinks.add(drink);
    }

    Drink getProductByVolume(double volume) {
        for (Drink drink : drinks) {
            if (drink.getVolume() == volume) {
                return drink;
            }
        }
        return new Drink("Not found!", 0, 0);
    }



}
