package exercise7;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second = Double.parseDouble(scanner.nextLine());

        if (first == second) {
            System.out.println("equal");
        } else {
            System.out.println(Math.max(first, second));
        }
    }
}
