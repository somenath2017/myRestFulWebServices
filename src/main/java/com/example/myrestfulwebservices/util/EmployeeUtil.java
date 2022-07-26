package com.example.myrestfulwebservices.util;

import com.example.myrestfulwebservices.domain.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtil {

    private static List<Employee> employeeList = new ArrayList<>();

    public static List<Employee> getListOfEmployees(){

       //return  Stream.of(new Employee("Roman","Rome",1),new Employee("Mark","Chicago",2)).collect(Collectors.toList());
       return employeeList;

    }

    public static Employee getEmployee(String employeeId) {
        return employeeList.stream().filter( e -> e.getEmployeeCode() == Integer.parseInt(employeeId)).collect(Collectors.collectingAndThen(Collectors.toList(),list -> list.get(0)));
    }

    public static Employee createEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }
}
