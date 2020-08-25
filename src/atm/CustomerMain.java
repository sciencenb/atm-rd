package atm;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Peter","1234567890123");
        Customer c2 = new Customer(2,"Nancy","1234567890123");

        Bank B1 = new Bank("KTB", new WSDatasource());

        B1.addCustoer(c1);
        B1.addCustoer(c2);

        ATM atm = new ATM(B1);
        atm.validateCustomer(1,"1234567890123");
        atm.deposit(1000);
        System.out.println(c1);
        atm.transfer(2, 150);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(B1);
    }
}
