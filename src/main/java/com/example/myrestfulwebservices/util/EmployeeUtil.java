package com.example.myrestfulwebservices.util;

import com.example.myrestfulwebservices.domain.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtil {

    public static List<Employee> getListOfEmployees(){

       return  Stream.of(new Employee("Roman","Rome",1),new Employee("Mark","Chicago",2)).collect(Collectors.toList());

    }

    public static Employee getEmployee(String employeeId) {
        return getListOfEmployees().stream().filter( e -> e.getEmployeeCode() == Integer.parseInt(employeeId)).collect(Collectors.collectingAndThen(Collectors.toList(),list -> list.get(0)));
    }
}
