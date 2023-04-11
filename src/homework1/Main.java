package homework1;

public class Main {
    public static void main(String[] args) {
        VendingMachineHotDrink vmHotDrink = new VendingMachineHotDrink();
        vmHotDrink.addProduct("Coffee", 25, 0.3, 80);
        vmHotDrink.addProduct("Tea", 15, 0.4, 95);
        vmHotDrink.addProduct("Latte", 40, 0.6, 90);
        System.out.println(vmHotDrink.getProduct("Tea"));
        System.out.println(vmHotDrink.getProduct(80));
        System.out.println(vmHotDrink.getProduct(0.6));
        System.out.println(vmHotDrink.getProduct(0.8));
    }
}
