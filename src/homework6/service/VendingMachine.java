package homework6.service;

import java.util.List;
import java.util.Map;

public interface VendingMachine {

    void addProduct(String productType, Map<String, Object> productData);

    List<String> getProducts(Map<String, Object> matchPattern);
    List<String> getProductTypes();

    List<String> getProductPriceList();
}
