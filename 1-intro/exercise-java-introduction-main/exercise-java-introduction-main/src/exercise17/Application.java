package exercise17;

public class Application {

    public static void main(String[] args){
        greet();
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(welcomeMessage("john"));
        System.out.println(isPositive(9));
        System.out.println(isPositive(-9));

    }

    // Code Sample 1
     public static void greet() {
         System.out.println("Hello, welcome to the Java course!");
     }

    // Code Sample 2
     public static boolean isEven(int number) {
         return number % 2 == 0;
     }

    // Code Sample 3
     public static String welcomeMessage(String name) {

        return "Welcome, " + name;
     }

    // Code Sample 4
     public static boolean isPositive(int number) {
         return number > 0;
    }
}
