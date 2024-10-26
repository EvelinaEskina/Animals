import animals.Animals;
import data.AnimalData;
import data.Menu;
import factory.AnimalFactory;
import utils.ValidateNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidateNumber validator = new ValidateNumber(scanner);

        List<Animals> animals = new ArrayList<>();

        System.out.println("Привет! Вводи команду ADD/LIST/EXIT");

        while (true) {
            String inputCommand = " ";
            //System.out.println("Привет! Вводи команду ADD/LIST/EXIT");
            String input = scanner.next();
            Menu command = Menu.IncorrectCommand(input);

            if (command == null) {
                System.out.println("Команда не верна, повторите команду: ");
                continue;
            }

            switch (command) {
                case ADD: {
                    boolean rightType = false;

                    System.out.println(String.format("Введите тип животного: cat/dog/duck"));
                    String animalType = scanner.nextLine().toUpperCase().trim();
                    boolean isAnimalValid = true;
                    for (AnimalData animalData : AnimalData.values()) {
                        if (!animalData.equals(animalType)) {
                            rightType = true;
                        } else {
                            System.out.println("Тип введен не верно");
                        }
                    }
                    scanner.nextLine().trim();


                    System.out.println("Введите имя животного");
                    String animalName = scanner.nextLine().trim();

                    System.out.println("Введите цвет животного");
                    String animalColour = scanner.nextLine().trim();


                    System.out.println("Введите возраст животного");
                    int animalAge = validator.getValidInput("Введите возраст животного");

                    if (animalAge == -1) {
                       System.out.println("Вы потратили все попытки ввода");
                       continue;
                    }


                    System.out.println("Введите вес животного");
                    int animalWeight = validator.getValidInput("Введите вес животного");
                    if (animalWeight == -1) {
                       System.out.println("Вы потратили все попытки ввода");
                       continue;
                    }


                        try {
                            Animals newAnimal = AnimalFactory.create(animalType,animalAge, animalWeight, animalName, animalColour);
                            animals.add(newAnimal);
                            newAnimal.say();
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                }
                       System.out.println("Вводи команду ADD/LIST/EXIT");
                        break;





                case LIST:
                    if (animals.isEmpty()) {
                        System.out.println("Добавьте животное: ADD/EXIT");
                    } else {
                        for (Animals animals1 : animals) {
                            System.out.println(animals1.toString());
                        }
                        System.out.println("Вводи команду ADD/LIST/EXIT");
                    }
                    break;


                case EXIT: {
                    System.exit(0);
                }

                default:
                    System.out.println("Некорректная команда");
            }
        }


    }
}






