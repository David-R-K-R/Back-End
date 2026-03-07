package exercise5;

import exercise4.Flat;

public class Application7 {

    public static void main(String[] args) {

        User user1 = new User("john","johnson");
        User user = new User("john","johnson", 45);

        user.age(5);

        user1.printOutput();
        user.printOutput();
    }
}
