package com.sapient.employeemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

    Logger LOGGER = LoggerFactory.getLogger(EmployeeManagementApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

}
