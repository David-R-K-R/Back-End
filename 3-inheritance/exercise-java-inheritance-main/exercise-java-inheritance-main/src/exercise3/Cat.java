package exercise3;

public class Cat extends Animals implements CanMakeSound {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void meow() {
        System.out.println(name + " meows");
    }

    @Override
    public void createSound() {
        meow();
    }
}
