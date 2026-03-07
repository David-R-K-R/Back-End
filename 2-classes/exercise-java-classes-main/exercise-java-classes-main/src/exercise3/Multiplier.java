package exercise3;

public class Multiplier {

    private final int multiplier;

    //constructer
    public Multiplier(int number) {
        this.multiplier = number;
    }

    public int multiply(int number) {
        return multiplier * number;
    }
}
