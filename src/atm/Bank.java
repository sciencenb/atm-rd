package atm;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
//    private DatabaseDataSource dataSource;
//    private WSDatasource wsDatasource;

    private DataSource dataSource;

    public Bank(String name, DataSource dataSource) {
        this.name = name;
//        this.customers = new ArrayList<>();
//        this.dataSource = new DatabaseDataSource();
//        this.customers = dataSource.getCustomerData();

        this.dataSource = dataSource;
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
