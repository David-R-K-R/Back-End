package exercise3;

public class Dog extends Animals implements CanMakeSound {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public void createSound() {
        bark();
    }
}
