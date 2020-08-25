package atm;

import java.util.ArrayList;

public class DatabaseDataSource implements DataSource {
    public ArrayList<Customer> getCustomerData() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100,"Andy", "1234"));
        customers.add(new Customer(200,"Brian", "12345"));
        customers.add(new Customer(300,"Tony", "123456"));
        return customers;
    }
}
