package com.sapient.employeemanagement.entity;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String ex) {
        super(ex);
    }
}
