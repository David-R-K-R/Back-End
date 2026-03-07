package exercise12;

public class Application {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

//        System.out.println("Nr:");
//        int size = Integer.parseInt(scanner.nextLine());

        int size = 5;
        int originalSize = 5;

        while (size>0){

            int tempsize = originalSize-(size-1);
            while (tempsize>0){
                System.out.print("*");
                tempsize --;
            }
            System.out.println("");

            size --;
        }
    }
}
