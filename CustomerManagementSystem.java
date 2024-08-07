import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class CustomerManagementSystem {
    private List<Customer> customers;

    public CustomerManagementSystem() {
        this.customers = new ArrayList<>();
    }

     public void addCustomer(Customer customer) {
        customers.add(customer);
    }

     public void removeCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }

     public Customer searchCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

  
    public void listAllCustomers() {
        for (Customer customer : customers) {
            System.out.println("ID: " + customer.getId() + ", Name: " + customer.getName() + ", Email: " + customer.getEmail());
        }
    }

     public void sortCustomersByName() {
        Collections.sort(customers, (c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    
    public void sortCustomersById() {
        Collections.sort(customers, (c1, c2) -> Integer.compare(c1.getId(), c2.getId()));
    }

    public static void main(String[] args) {
        CustomerManagementSystem cms = new CustomerManagementSystem();

        
        cms.addCustomer(new Customer(1, "John Doe", "john@example.com"));
        cms.addCustomer(new Customer(2, "Jane Doe", "jane@example.com"));

        cms.listAllCustomers();

        cms.sortCustomersByName();
        System.out.println("Sorted by name:");
        cms.listAllCustomers();

        cms.sortCustomersById();
        System.out.println("Sorted by ID:");
        cms.listAllCustomers();

        Customer customer = cms.searchCustomer(1);
        if (customer != null) {
            System.out.println("Customer found: " + customer.getName());
        } else {
            System.out.println("Customer not found");
        }

        cms.removeCustomer(1);
        cms.listAllCustomers();
    }
}
