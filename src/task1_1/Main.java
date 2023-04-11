package task1_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct("Coca-Cola", 100);
        vm.addProduct("Snikers", 50);
        vm.addProduct("Mars", 60);
        vm.addProduct("Pepsi", 90);
        vm.addProduct("Bounty", 55);

        System.out.println(vm.getProductByName("Mars").toString());
        System.out.println(vm.getProductByPrice(90).toString());
        System.out.println(vm.getProductByName("Pizza").toString());

    }
}
