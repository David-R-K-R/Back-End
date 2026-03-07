package exercise6;

public class Application {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Age:");
        int age = Integer.parseInt(scanner.nextLine());
        boolean ofAge = age > 17;

        System.out.printf("Of Age?" + ofAge);
    }

}
