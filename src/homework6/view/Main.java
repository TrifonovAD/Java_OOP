package homework6.view;

import homework6.controller.VendingMachineController;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();
        vMachineController.addProduct("Food", Map.of("name", "Peanuts", "cost", 40, "weight", 0.1));
        vMachineController.addProduct("Food", Map.of("name", "M&ms", "cost", 100, "weight", 0.07));
        vMachineController.addProduct("Food", Map.of("name", "Snikers", "cost", 50, "weight", 0.08));
        vMachineController.addProduct("Food", Map.of("name", "Mars", "cost", 55, "weight", 0.05));
        vMachineController.addProduct("Food", Map.of("name", "Mars", "cost", 100, "weight", 0.1));
        vMachineController.addProduct("HotDrink", Map.of("name", "Coffee", "cost", 90, "volume", 0.3, "temp", 80));
        vMachineController.addProduct("HotDrink", Map.of("name", "Black tea", "cost", 30, "volume", 0.4, "temp", 90));
        vMachineController.addProduct("HotDrink", Map.of("name", "Latte", "cost", 120, "volume", 0.5, "temp", 70));
        vMachineController.addProduct("Drink", Map.of("name", "Coka-cola", "cost", 90, "volume", 0.5));
        vMachineController.addProduct("Drink", Map.of("name", "Water", "cost", 40, "volume", 0.6));
        vMachineController.addProduct("Drink", Map.of("name", "Fanta", "cost", 50, "volume", 0.33));

        System.out.println("Полный список продуктов:");
        System.out.println("===============================");
        for (String priceItem : vMachineController.getPriceList()) {
            System.out.println(priceItem);

        }

        System.out.println("===============================");
        System.out.println(vMachineController.getProductByMatch(Map.of("cost", 50)));
        System.out.println(vMachineController.getProductByMatch(Map.of("name", "Latte")));
        System.out.println(vMachineController.getProductByMatch(Map.of("name", "Mars")));

    }
}
