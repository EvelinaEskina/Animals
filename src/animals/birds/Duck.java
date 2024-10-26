package animals.birds;

import animals.Animals;

public class Duck extends Animals implements Flying {

    public Duck(String name, int age, String colour, int weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void say() {
        System.out.println("Кря-Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");

    }
}
