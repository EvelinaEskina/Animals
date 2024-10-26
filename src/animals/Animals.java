package animals;

public abstract class Animals {
    private String name;
    private int age;
    private String colour;
    private int weight;

    private String agetoString() {
        int ostatok = age % 10;
        int celoeAge = age / 10;

        if (celoeAge == 1 || ostatok == 0) {
            return "год";
        }
        if (ostatok >= 2 && ostatok <= 4) {
            return "года";
        }

        return "лет";
    }

    @Override
    public String toString() {
        return  "Привет!"+
                "Меня зовут" + name +
                ", мне " + age + " " + agetoString() +
                ", я вешу - " + weight +
                " кг, мой цвет - " + colour;
    }

    public Animals (String name, int age, String colour, int weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }

    public void toSay () {
        System.out.println("Я говорю");
    }
    public void  toGo () {
        System.out.println("Я иду");
    }
    public void toDrink () {
        System.out.println("Я пью");
    }
    public void toEat () {
        System.out.println("Я ем");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age < 0) {
            System.out.println("Введено неверное значение");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void say();
}

