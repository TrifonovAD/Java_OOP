package homework6.controller;

import homework6.service.VendingMachineImpl;

import java.util.List;
import java.util.Map;

public class VendingMachineController {
    private VendingMachineImpl vendingMachineImpl = new VendingMachineImpl();

    public void addProduct(String productType, Map<String, Object> productData) {
        if (vendingMachineImpl.getProductTypes().contains(productType)) {
            vendingMachineImpl.addProduct(productType, productData);
        }
    }

    public List<String> getProductByMatch(Map<String, Object> matchPattern) {
        return vendingMachineImpl.getProducts(matchPattern);
    }

    public List<String> getPriceList() {
        return vendingMachineImpl.getProductPriceList();
    }
}
