<%@ page import="java.time.LocalDate" %>
<%@ page import="chanh.com.wwwweek2.backend.repositories.EmployeeRepository" %>
<%@ page import="chanh.com.wwwweek2.backend.models.Employee" %>
<%@ page import="chanh.com.wwwweek2.backend.enums.EmployeeStatus" %>
<%@ page import="chanh.com.wwwweek2.backend.repositories.ProductRepository" %>
<%@ page import="chanh.com.wwwweek2.backend.enums.ProductStatus" %>
<%@ page import="chanh.com.wwwweek2.backend.models.Product" %>
<%@ page import="chanh.com.wwwweek2.backend.models.ProductImage" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<%
    EmployeeRepository repository = new EmployeeRepository();
    Employee emp = new Employee("teo", LocalDate.now(), "teo" + System.currentTimeMillis() + "@mail.com", "2349235", "12 NVB", EmployeeStatus.ACTIVE);
    repository.insertEmp(emp);
    ProductRepository productRepository = new ProductRepository();
    Product product = new Product("xoai", "xoai ngot", "kg", "ba dua", ProductStatus.ACTIVE);
    ProductImage productImage = new ProductImage();
    productImage.setAlternative("xxx xxx");
    productImage.setPath("/images/zzz.jpg");
    productImage.setProduct(product);
    product.getProductImageList().add(productImage);
    productRepository.insert(product);
%>
</body>
</html>