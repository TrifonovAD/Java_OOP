package homework6.service;

import homework6.model.Drink;
import homework6.model.Food;
import homework6.model.HotDrink;
import homework6.repository.ProductRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VendingMachineImpl implements VendingMachine{

    List<String> productTypes = Arrays.asList("Food", "Drink", "HotDrink");

    @Override
    public void addProduct(String productType, Map<String, Object> productData) {
        switch (productType) {
            case "Food":
                ProductRepository.productsList.add(new Food(productData));
                break;
            case "Drink":
                ProductRepository.productsList.add(new Drink(productData));
                break;
            case "HotDrink":
                ProductRepository.productsList.add(new HotDrink(productData));
                break;
            default:
                break;
        }
    }



    @Override
    public List<String> getProducts(Map<String, Object> matchPattern) {
        return ProductRepository.productsList.stream().filter(product -> product.isMatch(matchPattern))
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();

    }

    @Override
    public List<String> getProductPriceList() {
        return ProductRepository.productsList.stream()
                .map(product -> product.getClass().getSimpleName() + " => " + Objects.toString(product)).toList();
    }

    @Override
    public List<String> getProductTypes() {
        return productTypes;
    }
}
