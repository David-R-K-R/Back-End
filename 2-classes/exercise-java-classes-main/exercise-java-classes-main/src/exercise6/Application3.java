package exercise6;

public class Application3 {

    public static void main(String[] args) {
        User user1 = new User("john", "johnson");
        Address address = new Address("Main Street", 42, 2000, "Antwerp");
        user1.setAddress(address);
        user1.printOutput();
    }
}
