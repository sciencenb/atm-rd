package atm;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    private DataSource dataSource;

    public Bank(String name) {
        this.name = name;
//        this.customers = new ArrayList<>();
        this.dataSource = new DataSource();
        this.customers = dataSource.getCustomerData();
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
