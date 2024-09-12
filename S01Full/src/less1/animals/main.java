package less1.animals;

import java.time.LocalDate;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //       System.out.println("Hello World");

        Cat barsik = new Cat("Barsik", LocalDate.of(1980, 1, 1), new Owner());
        Animal animal = new Animal("Animal-1", LocalDate.now());


        System.out.println(animal.getName());
        System.out.println(animal.getBirthDate());

        System.out.println(barsik.getName());
        System.out.println(barsik.getBirthDate());

        barsik.setName("Tom");
        System.out.println(barsik.getName());

        System.out.println(barsik);
        System.out.println(animal);

        System.out.println(barsik.getType());
        Dog dog1 = new Dog("Dog-1", LocalDate.now());
        System.out.println(dog1.getType());

        Animal animalCat = new Cat("Cat-1", LocalDate.now(), new Owner());
        Animal animalDog = new Dog("Dog-1", LocalDate.now());

        List<Animal> animals = List.of(animal, animalCat, animalDog, barsik);

        System.out.println(animals);
    }

}
