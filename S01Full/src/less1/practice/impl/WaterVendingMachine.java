package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

    public WaterVendingMachine() {
        super();
    }
}
