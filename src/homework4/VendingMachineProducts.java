package homework4;

import java.util.List;

public class VendingMachineProducts<T extends Product> implements VendingMachine {
    private List<T> products;

    public void addProduct(List<T> products) {
        this.products = products;
    }
    public String getProduct(String name) {
        for (T product : products) {
            if (product.getName().equals(name)) return product.toString();
        }
        return "Not found!";
    }
    public String getProduct(int cost) {
        for (T product : products) {
            if (product.getCost() == cost) return product.toString();
        }
        return "Not found!";
    }
    public String getProduct(double volume) {
        for (T product : products) {
            if (product instanceof Drink && ((Drink) product).getVolume() == volume) return product.toString();
        }
        return "Not found!";
    }

    @Override
    public void addProduct() {

    }

    @Override
    public String getProduct() {
        return null;
    }
}
