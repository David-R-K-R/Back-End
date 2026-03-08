package exercise3;

public class Application3 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog amaretto = new Dog("Amaretto");
        amaretto.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.meow();

        CanMakeSound[] soundMakers = {dog, amaretto, cat, garfield};
        for (CanMakeSound soundMaker : soundMakers) {
            soundMaker.createSound();
        }
    }
}
