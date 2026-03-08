package exercise1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            if (sentence.isBlank()) {
                break;
            }

            String[] words = sentence.split(" ");
            for (String word : words) {
                if (word.toLowerCase().contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
