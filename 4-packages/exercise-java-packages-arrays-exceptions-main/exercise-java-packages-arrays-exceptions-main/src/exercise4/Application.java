package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        while (true) {
            int line = Integer.parseInt(scanner.nextLine());

            if (line <= -1) {
                System.out.println("start");
                int start = Integer.parseInt(scanner.nextLine());

                System.out.println("end");
                int end = Integer.parseInt(scanner.nextLine());

                for(int i = start; i<end; i++){
                    System.out.println(numList.get(i));
                }

                break;
            }

            numList.add(line);


        }
    }
}
