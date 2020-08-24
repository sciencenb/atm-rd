package atm;

public class BankAccount {
    private int id;
    private String name;
    private String type;
    private double balance;

    public BankAccount(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public BankAccount(int id, String name, String type, double balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", type='" + this.type + '\'' +
                ", balance=" + this.balance +
                '}';
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}