package exercise4;

public class Application4 {

    public static void main(String[] args) {

        Flat f1 = new Flat(3, 80, 10);
        Flat f2 = new Flat(2, 50, 12);

        System.out.println(Flat.largerThan(f1, f2));
        System.out.println(Flat.priceDifference(f1, f2));

        System.out.println(f1.largerThan(f2));
        System.out.println(f1.priceDifference(f2));

    }
}
