package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.Package;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));
        Product bottle2 = new BottleOfWater("Родники Газ", 55, LocalDate.of(2024, 5, 1), true, Package.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");
        System.out.println(vm.getProducts());

    }
}
