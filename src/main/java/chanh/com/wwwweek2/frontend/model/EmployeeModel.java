package chanh.com.wwwweek2.frontend.model;

import chanh.com.wwwweek2.backend.enums.EmployeeStatus;
import chanh.com.wwwweek2.backend.models.Employee;
import chanh.com.wwwweek2.backend.services.EmployeeServices;
import jakarta.json.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeModel {
    public Object insertEmp(HttpServletRequest req, HttpServletResponse resp) throws IOException, InterruptedException {
        String name = req.getParameter("name");
        String s_dob = req.getParameter("dob");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(s_dob, formatter);

        Employee employee = new Employee(name, dob, email, phone, address, EmployeeStatus.IN_ACTIVE);
        EmployeeServices services =new EmployeeServices();
        services.insertEmp(employee);
        return employee;
        /*ObjectWriter out = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String jsonEmp = out.writeValueAsString(employee);
        try(Client client= ClientBuilder.newClient()){
            WebTarget wt = client.target(URI.create("http://localhost:8080/week_02/api/employees"));

            Employee empl = wt.request()
                    .post(Entity.entity(employee, MediaType.APPLICATION_JSON), Employee.class);
            System.out.println(empl);
            System.out.println("------------------------");

            return employee;
        }*/
        /*jsonEmp ="{\n" +
                "  \"id\" : 0,\n" +
                "  \"fullname\" : \"teo\",\n" +
                "  \"dob\" : \"2000-12-09\",\n" +
                "  \"email\" : \"teo@gmail.com\",\n" +
                "  \"phone\" : \"346984386743\",\n" +
                "  \"address\" : \"asf safs a\",\n" +
                "  \"status\" : \"1\"\n" +
                "}";
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(jsonEmp))
                .uri(URI.create("http://localhost:8080/week_02/api/employees"))
//                .setHeader("Content-Type","application/json")
//                .setHeader("Accept","application/json")
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.statusCode();*/
    }
}
