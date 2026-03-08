package exercise2;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("sentence");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isBlank()) {
                break;
            }

            String[] words = sentence.split(" ");
            System.out.println(words[words.length-1]);
        }
    }
}
