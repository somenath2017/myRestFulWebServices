package com.example.myrestfulwebservices.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String address;
    private int employeeCode;
}
