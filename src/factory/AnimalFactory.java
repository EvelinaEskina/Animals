package factory;

import animals.Animals;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalData;

public class AnimalFactory {
    private int age;
    private int weight;
    private static String name;
    private String colour;

    public AnimalFactory(int age, int weight, String name, String colour) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.colour = colour;
    }

    public static AnimalData valueOf(String animalType) {
        return null;
    }




    public static Animals create(String animalType, int age, int weight, String colour, String type) {
        switch (type) {
            case "Cat":
                return new Cat(name, age, colour, weight);
            case "Dog":
                return new Dog(name, age, colour, weight);
            case "Duck":
                return new Duck(name, age, colour, weight);
            default:
                throw new IllegalArgumentException("Некорректный тип " + type);


        }
    }
}
