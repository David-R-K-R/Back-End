package exercise11;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            double number = Double.parseDouble(scanner.nextLine());

            if (number < 0) {
                break;
            }

            if (number > 0) {
                sum += number;
                count++;
            }
        }

        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum / count);
        }
    }
}
