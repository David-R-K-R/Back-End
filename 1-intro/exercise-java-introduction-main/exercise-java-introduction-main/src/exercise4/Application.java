package exercise4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;

        System.out.println("Celsius: " + celsius + " C");
        System.out.println("Fahrenheit: " + fahrenheit + " F");
        System.out.println("Kelvin: " + kelvin + " K");
    }
}
