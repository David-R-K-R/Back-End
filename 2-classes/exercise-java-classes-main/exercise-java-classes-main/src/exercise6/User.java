package exercise6;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public void setAddress(Address address){
        this.address=address;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printOutput() {
        System.out.printf("%s %s %d lives in %s %d, %d %s%n",
                firstName, lastName, age,
                address.street, address.houseNumber, address.postalCode, address.municipality);
    }
}
