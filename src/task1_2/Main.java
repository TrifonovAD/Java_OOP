package task1_2;

public class Main {
    public static void main(String[] args) {
        VendingMachineDrink vm = new VendingMachineDrink();
        vm.addDrink("Fanta", 45, 0.48);
        vm.addDrink("Cola", 60, 0.6);
        vm.addDrink("Sprite", 50, 0.5);
        vm.addDrink("Water", 30, 1);

        System.out.println(vm.getProductByName("Fanta"));
        System.out.println(vm.getProductByPrice(60));
        System.out.println(vm.getProductByVolume(0.6));
        System.out.println(vm.getProductByVolume(0.3));
    }


}
