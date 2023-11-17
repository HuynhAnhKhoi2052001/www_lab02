package chanh.com.wwwweek2.frontend.model;

import chanh.com.wwwweek2.backend.models.Customer;
import chanh.com.wwwweek2.backend.services.CustomerServices;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

public class CustomerModel {
    private final CustomerServices services = new CustomerServices();

    public void insertCust(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        Customer customer = new Customer(name, email, phone, address);
        services.insertCust(customer);
        //xu ly sau khi insert
        resp.sendRedirect("customerListing.jsp");
    }

    public List<Customer> getAllCustomer() {
        return services.getAll();
    }
}
