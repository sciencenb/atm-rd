package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Peter","1234567890123");
        Customer c2 = new Customer(2,"Nancy","1234567890123");

        System.out.println(c1);
        System.out.println(c2);
    }
}
