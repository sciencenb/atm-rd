package atm;

import java.util.ArrayList;

public class WSDatasource implements DataSource {
    public ArrayList<Customer> getCustomerData() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(100, "Andy", "1234"));
        customers.add(new Customer(200, "ใบเฟิร์น", "12345"));
        return customers;
    }
}
