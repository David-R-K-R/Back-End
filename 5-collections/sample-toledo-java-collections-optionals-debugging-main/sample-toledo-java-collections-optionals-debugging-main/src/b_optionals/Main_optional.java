package b_optionals;

import java.util.Optional;

public class Main_optional {

    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Hello");      // Value must not be null
        Optional<String> opt2 = Optional.ofNullable(null); // Can be null
        Optional<String> opt3 = Optional.empty();          // No value present

        Optional<String> amelia = Optional.of("Amelia");
        System.out.println("Hello, " + amelia.orElse("Guest"));  // Hello, Amelia

        Optional<String> nobody = Optional.empty();
        System.out.println("Hello, " + nobody.orElse("Guest"));  // Hello, Guest

        if (amelia.isPresent()) {
            System.out.println("Amelia has a name");
        }

        nobody.ifPresent((n) -> System.out.println("Nobody has " + n + " as name%n"));
        // nothing happens because nobody is empty

        nobody.orElseThrow();
        // exception is thrown because nobody is empty\

        nobody.orElseThrow(() -> new RuntimeException("My own exception"));
        // If you want you can choose the exception you want to throw with some special syntax
    }
}
