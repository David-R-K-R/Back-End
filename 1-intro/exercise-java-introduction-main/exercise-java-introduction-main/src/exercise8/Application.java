package exercise8;

import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word1:");
        String w1 = scanner.nextLine();

        System.out.println("word2");
        String w2 = scanner.nextLine();

        if (Objects.equals(w1, w2)){
            System.out.println("equal");

        }
        else {
            System.out.println("not equal");
        }
    }
}
