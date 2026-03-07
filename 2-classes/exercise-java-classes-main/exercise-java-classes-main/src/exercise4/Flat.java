package exercise4;

import static java.lang.Math.abs;

public class Flat {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Flat(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

//    A method public boolean largerThan(Flat toCompare) which returns true if the given flat is larger than the flat being compared to

    public boolean largerThan(Flat toCompare){
        return toCompare.squareMeters > this.squareMeters;
    }

    public static boolean largerThan(Flat f1, Flat f2){
        return f1.largerThan(f2);
    }

//    A method public int priceDifference(Flat toCompare) which returns the price difference between the two flats

    public int priceDifference(Flat toCompare){
        float toCompareNr = toCompare.pricePerSquareMeter * toCompare.squareMeters;
        float toCompareNr2 = this.pricePerSquareMeter * this.squareMeters;

        return abs((int) (toCompareNr - toCompareNr2));
    }

    public static int priceDifference(Flat f1, Flat f2){
        return f1.priceDifference(f2);
    }

}
