package exercise13;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
