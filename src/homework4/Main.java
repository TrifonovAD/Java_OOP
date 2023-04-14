package homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineProducts<Drink> vmDrinks = new VendingMachineProducts<>();
        List<Drink> drinks = new ArrayList<>(Arrays.asList(
                new Drink("Fanta", 65, 0.5),
                new Drink("Cola", 50, 0.3),
                new Drink("Sprite", 70, 0.6)));


        VendingMachineProducts<HotDrink> vmHotDrinks = new VendingMachineProducts<>();
        List<HotDrink> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffe", 90, 0.5, 90),
                new HotDrink("Latte", 85, 0.7, 85),
                new HotDrink("Tea", 40, 0.4, 95)));

        vmDrinks.addProduct(drinks);
        System.out.println(vmDrinks.getProduct("Fanta"));
        System.out.println(vmDrinks.getProduct(70));
        System.out.println(vmDrinks.getProduct(0.3));
        System.out.println(vmDrinks.getProduct(100));

        vmHotDrinks.addProduct(hotDrinks);
        System.out.println(vmHotDrinks.getProduct("Tea"));
        System.out.println(vmHotDrinks.getProduct(85));
        System.out.println(vmHotDrinks.getProduct(0.5));
        System.out.println(vmHotDrinks.getProduct(100));


    }
}
