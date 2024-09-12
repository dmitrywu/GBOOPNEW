package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {
    private float volume;
    private Package pack;



    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
    }
}
