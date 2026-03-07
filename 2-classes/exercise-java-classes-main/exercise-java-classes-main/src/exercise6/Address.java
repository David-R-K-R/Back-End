package exercise6;

public class Address {
    String street;
    int houseNumber;
    int postalCode;
    String municipality;

    public Address(String street, int houseNumber, int postalCode, String municipality) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.municipality = municipality;
    }
}