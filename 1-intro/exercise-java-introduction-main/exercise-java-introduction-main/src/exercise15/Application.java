package exercise15;

public class Application {

    public static void main(String[] args) {
        System.out.println(add(10, 5));
        System.out.println(subtract(10, 5));
        System.out.println(multiply(10, 5));
        System.out.println(divide(10, 5));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
