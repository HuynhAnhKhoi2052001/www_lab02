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
        EmployeeServices services = new EmployeeServices();
        services.insertEmp(employee);
        return employee;

    }
}
