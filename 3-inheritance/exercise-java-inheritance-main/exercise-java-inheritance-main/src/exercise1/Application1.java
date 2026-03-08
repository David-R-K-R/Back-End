package exercise1;

public class Application1 {

    public static void main(String[] args) {

        Person eddy = new Person("Eddy Merckx", "Binkomstraat 1, 3391 Meensel-Kiezegem");
        Person tom = new Person("Tom Boonen", "Boonenstraat 15 2560 Mol");
        System.out.println(eddy);
        System.out.println(tom);

        Student ollie = new Student("Ollie", "Naamsestraat 25, 3000 Leuven");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        Teacher eddy2 = new Teacher("Eddy Merckx", "Binkomstraat 1, 3391 Meensel-Kiezegem", 1200);
        Teacher tom2 = new Teacher("Tom Boonen", "Boonenstraat 15 2560 Mol", 2400);
        System.out.println(eddy2);
        System.out.println(tom2);

    }
}
