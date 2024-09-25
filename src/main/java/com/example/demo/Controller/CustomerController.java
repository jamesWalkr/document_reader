package com.example.demo.Controller;

import com.example.demo.models.Customer;
import com.example.demo.models.Employee;
import com.example.demo.repositories.CustomerRepo;
import com.example.demo.repositories.EmployeeRepo;
import org.springframework.web.bind.annotation.*;

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

}
