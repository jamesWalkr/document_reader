package com.example.demo.repositories;

import com.example.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    @Override
    List<Employee> findAll();
}
