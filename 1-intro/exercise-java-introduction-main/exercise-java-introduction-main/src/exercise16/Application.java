package exercise16;

public class Application {

    public static void main(String[] args) {
        printStars(3);
        printSquare(4);
        printRectangle(2, 3);
    }

    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            printStars(n);
        }
    }

    public static void printRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }
}
