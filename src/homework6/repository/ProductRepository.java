package homework6.repository;

import homework6.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    static public List<Product> productsList = new ArrayList<>();
    static public void addProduct(Product product){
        productsList.add(product);
    }
}
