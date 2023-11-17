package chanh.com.wwwweek2.backend.services;


import chanh.com.wwwweek2.backend.models.Customer;
import chanh.com.wwwweek2.backend.repositories.CustomerRepository;

import java.util.List;

public class CustomerServices {
    private final CustomerRepository repository = new CustomerRepository();

    public CustomerServices() {
//        repository = new CustomerRepository();
    }

    public void insertCust(Customer customer) {
        repository.insertCust(customer);
    }

    public List<Customer> getAll() {
        return repository.getAllCust();
    }
}
