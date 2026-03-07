package exercise3;

public class Application5 {

    public static void main(String[] args) {
        Multiplier doubler = new Multiplier(2);
        Multiplier tripler = new Multiplier(3);

        System.out.println("5 doubled is " + doubler.multiply(5));
        System.out.println("4 tripled is " + tripler.multiply(4));
    }
}
