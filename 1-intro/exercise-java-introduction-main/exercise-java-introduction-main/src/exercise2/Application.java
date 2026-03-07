package exercise2;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Nr1:");
        int nr1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nr2:");
        int nr2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nr3:");
        int nr3 = Integer.parseInt(scanner.nextLine());

        int avg = (nr1 + nr2 + nr3)/3;
        int sum = nr1 + nr2 + nr3;

        System.out.println(avg);
        System.out.println(sum);


    }
}
