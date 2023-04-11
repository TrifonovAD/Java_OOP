package homework1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineDrink implements VendingMachine{

    List<Drink> drinks = new ArrayList<>();
    @Override
    public String getProduct() {
        return "Not found!";
    }

    public String getProduct(String name){
        for (Drink drink : drinks) {
            if (drink.getName().equals(name)) {
                return drink.toString();
            }
        }
        return "Not found!";
    }

    public String getProduct(double volume) {
        for (Drink drink : drinks) {
            if (drink.getVolume() == volume) {
                return drink.toString();
            }
        }
        return "Not found!";
    }



    @Override
    public void addProduct() {

    }
}
