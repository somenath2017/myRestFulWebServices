package com.example.myrestfulwebservices.service;

import com.example.myrestfulwebservices.domain.Employee;
import com.example.myrestfulwebservices.util.EmployeeUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        return EmployeeUtil.getListOfEmployees();
    }
}