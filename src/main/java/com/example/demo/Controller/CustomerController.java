package com.example.demo.Controller;

import com.example.demo.models.Customer;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CustomerRepo;
import com.example.demo.repositories.EmployeeRepo;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private CustomerRepo customerRepo;
    private EmployeeRepo employeeRepo;

    public CustomerController(CustomerRepo customerRepo, EmployeeRepo employeeRepo) {
        this.customerRepo = customerRepo;
        this.employeeRepo = employeeRepo;
    }

    @PostMapping("/id/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id){

        Optional<Customer> customer = customerRepo.findById(id);

        return  customer;
    }

    @GetMapping("/employee/all")
    public List<Employee> getAllEmployees(){

        List<Employee> allEmployees = employeeRepo.findAll();

        return allEmployees;

    }

    @GetMapping("/csv")
    public void exportCsv(HttpServletResponse response) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
        String fileName = "employee_data.csv";

        response.setContentType("text/csv");
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename\"" + fileName +"");

        StatefulBeanToCsv<Employee> writer = new StatefulBeanToCsvBuilder<Employee>(response.getWriter())
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .withOrderedResults(true)
                .build();

        writer.write(employeeRepo.findAll());


    }

}
