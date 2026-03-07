package exercise1;

public class Application2 {

    public static void main(String[] args) {
        Account account = new Account("Owner", 100);
        System.out.println("Initial balance: " + account.balance());

        account.deposit(20);
        account.withdraw(40);

        System.out.println("Final balance: " + account.balance());
    }
}
