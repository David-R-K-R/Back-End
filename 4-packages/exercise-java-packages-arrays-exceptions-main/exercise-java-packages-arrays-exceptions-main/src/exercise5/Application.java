package exercise5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers, type end to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("You may only enter numbers or end.");
            }
        }

        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        System.out.println("average: " + average);
    }
}
