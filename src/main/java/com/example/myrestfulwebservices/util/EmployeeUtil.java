package com.example.myrestfulwebservices.util;

import com.example.myrestfulwebservices.domain.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtil {

    public static List<Employee> getListOfEmployees(){

       return  Stream.of(new Employee("Roman","Rome",01),new Employee("Mark","Chicago",02)).collect(Collectors.toList());

    }
}
