package exercise4;

public class Application4 {

    public static void main(String[] args) {
        TacoBox triple = new TripleTacoBox();
        TacoBox custom = new CustomTacoBox(5);

        System.out.println("Triple tacos at start: " + triple.tacosRemaining());
        triple.eat();
        System.out.println("Triple tacos after eating 1: " + triple.tacosRemaining());

        System.out.println("Custom tacos at start: " + custom.tacosRemaining());
        custom.eat();
        custom.eat();
        System.out.println("Custom tacos after eating 2: " + custom.tacosRemaining());
    }
}
