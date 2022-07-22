package com.example.myrestfulwebservices.controller;

import com.example.myrestfulwebservices.domain.Employee;
import com.example.myrestfulwebservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *  Controller class which will handle all rest api calls
 */
@RestController
public class MyRestWebServiceController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getUser")
    public List<Employee> greetUser(){
        return employeeService.getAllEmployees();
    }


}
