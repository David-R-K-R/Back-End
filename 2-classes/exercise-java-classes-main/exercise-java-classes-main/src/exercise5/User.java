package exercise5;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    public void age(){
        this.age += 1;
    }

    public void age(int number){
        this.age += number;
    }

    public void printOutput(){
        System.out.printf("%s%s%s%s%s%n", firstName," ", lastName, " ", age);
    }
}
