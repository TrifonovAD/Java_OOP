package task1_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    public List<Product> products = new ArrayList<Product>();
    public Product getProductByName(String name){
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }

        }
        return new Product("Not found!", -1);
    }

    public Product getProductByPrice(double cost){
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return new Product("Not found!", -1);
    }

    public void addProduct(String name, double cost) {
        Product product = new Product(name, cost);
        products.add(product);
    }
}