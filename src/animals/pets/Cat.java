package animals.pets;

import animals.Animals;

public class Cat extends Animals {
    public Cat(String name, int age, String colour, int weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");

    }
}
