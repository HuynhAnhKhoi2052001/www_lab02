package chanh.com.wwwweek2.backend.resources;

import chanh.com.wwwweek2.backend.models.Customer;
import chanh.com.wwwweek2.backend.services.CustomerServices;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/customers")
public class CustomerResources {
    private final CustomerServices customerServices = new CustomerServices();
    @POST
//    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(Customer customer) {
        customerServices.insertCust(customer);
        return Response.ok(customer).build();
    }

    @GET
    @Produces("application/json")
    public Response getAll(){
        List<Customer> lst = customerServices.getAll();
        return Response.ok(lst).build();
    }
}
