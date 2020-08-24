package atm;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount(1, "Peter", "Saving");
        BankAccount B2 = new BankAccount(2, "Nancy", "Checking", 1000);
        System.out.println(B1);
        System.out.println(B2);

        B1.deposit(500);
        B2.deposit(750);
        System.out.println("\r\nAfter Deposid()");
        System.out.println(B1);
        System.out.println(B2);

        B1.withdraw(150);
        B2.withdraw(250);
        System.out.println("\r\nAfter Withdraw()");
        System.out.println(B1);
        System.out.println(B2);
    }
}
