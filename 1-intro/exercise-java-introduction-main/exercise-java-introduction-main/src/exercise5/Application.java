package exercise5;


public class Application {

    public static void main(String[] args) {
        int maxValue = 2147483647;
        System.out.println("Before increment: " + maxValue);

        maxValue = maxValue + 1;
        System.out.println("After increment: " + maxValue);
    }
}
