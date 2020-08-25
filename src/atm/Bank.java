package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustoer(Customer c) {
        customers.add(c);
    }

    public Customer findCustomer(int id) {
        for (Customer e : customers){
            if(e.getId() == id) { return e; }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
