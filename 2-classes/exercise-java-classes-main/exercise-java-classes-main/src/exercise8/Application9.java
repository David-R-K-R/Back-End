package exercise8;

public class Application9 {

    public static void main(String[] args) {
        Person grandmaRose = new Person("Rose", null, null);
        Person grandpaJohn = new Person("John", null, null);
        Person grandmaAnna = new Person("Anna", null, null);
        Person grandpaMark = new Person("Mark", null, null);

        Person motherLisa = new Person("Lisa", grandmaRose, grandpaJohn);
        Person fatherTom = new Person("Tom", grandmaAnna, grandpaMark);

        Person childAlex = new Person("Alex", motherLisa, fatherTom);
        Person childEmma = new Person("Emma", motherLisa, fatherTom);
        Person childNoah = new Person("Noah", null, fatherTom);
        Person stranger = new Person("Mia", null, null);

        printTest("siblings (Alex, Emma)", true, childAlex.isSiblingOf(childEmma));
        printTest("siblings (Alex, Alex)", false, childAlex.isSiblingOf(childAlex));
        printTest("siblings with missing parent (Alex, Noah)", false, childAlex.isSiblingOf(childNoah));
        printTest("siblings with null", false, childAlex.isSiblingOf(null));

        printTest("grandparent (Rose -> Alex)", true, grandmaRose.isGrandparentOf(childAlex));
        printTest("grandparent (John -> Alex)", true, grandpaJohn.isGrandparentOf(childAlex));
        printTest("grandparent (Anna -> Alex)", true, grandmaAnna.isGrandparentOf(childAlex));
        printTest("grandparent (Mark -> Alex)", true, grandpaMark.isGrandparentOf(childAlex));
        printTest("not grandparent (Mia -> Alex)", false, stranger.isGrandparentOf(childAlex));
        printTest("grandparent with null", false, grandmaRose.isGrandparentOf(null));

        printTest("grandchild (Alex -> Rose)", true, childAlex.isGrandchildOf(grandmaRose));
        printTest("grandchild (Alex -> Mark)", true, childAlex.isGrandchildOf(grandpaMark));
        printTest("not grandchild (Alex -> Mia)", false, childAlex.isGrandchildOf(stranger));
        printTest("grandchild with null", false, childAlex.isGrandchildOf(null));
    }

    private static void printTest(String label, boolean expected, boolean actual) {
        String status = expected == actual ? "PASS" : "FAIL";
        System.out.printf("%s - %s (expected=%s, actual=%s)%n", status, label, expected, actual);
    }
}
