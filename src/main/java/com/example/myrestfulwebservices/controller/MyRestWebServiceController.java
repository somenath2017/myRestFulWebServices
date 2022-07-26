package com.example.myrestfulwebservices.controller;

import com.example.myrestfulwebservices.domain.Employee;
import com.example.myrestfulwebservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *  Controller class which will handle all rest api calls
 */
@RestController
public class MyRestWebServiceController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getUsers")
    public List<Employee> getListOfUsers(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getUser/{id}")
    public Employee getUser(@PathVariable String id){
        return employeeService.getEmployee(id);
    }

    @PostMapping(value = "/createUser",consumes = "application/json",produces = "application/json")
    public Employee createEmployee(@RequestBody() Employee employee){
         return employeeService.createEmployee(employee);
        }


}
