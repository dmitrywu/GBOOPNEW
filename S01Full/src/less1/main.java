package less1;

import java.time.LocalDate;

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


    }

}
