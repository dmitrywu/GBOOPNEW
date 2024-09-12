package less1.animals;

import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate birthDate;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", birthDate=" + birthDate + '}';
    }
}