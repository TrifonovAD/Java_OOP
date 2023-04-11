package task1_2;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {


    Product getProductByName(String name);

    Product getProductByPrice(double cost);
}
