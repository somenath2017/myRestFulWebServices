package com.example.myrestfulwebservices.service;

import com.example.myrestfulwebservices.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
        List<Employee> getAllEmployees();
        Employee getEmployee(String employeeId);
        Employee createEmployee(Employee employee);
}
