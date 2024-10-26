package animals.pets;

import animals.Animals;

public class Dog extends Animals {

    public Dog(String name, int age, String colour, int weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }
}
