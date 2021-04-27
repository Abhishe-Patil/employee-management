package com.sapient.employeemanagement.controller;

import ch.qos.logback.classic.Logger;
import com.sapient.employeemanagement.Service.EmployeeRepo;
import com.sapient.employeemanagement.Service.EmployeeService;
import com.sapient.employeemanagement.entity.EmployeeEntity;
import com.sapient.employeemanagement.entity.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    Logger LOGGER;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/employees")
    public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employee) {
        EmployeeEntity savedEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body(savedEmployee);
    }

    @GetMapping("/employees/{id}")
    public EmployeeEntity retrieveEmployee(@PathVariable long id) {
        Optional<EmployeeEntity> employee = employeeService.getEmployeeById(id);

        if (!employee.isPresent())
            throw new EmployeeNotFoundException("id-" + id);

        return employee.get();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable long id,@RequestBody EmployeeEntity employee){
    LOGGER.info("Request received to update project of EmployeeId: "+ id);
        EmployeeEntity employeeEntity=employeeService.updateEmployee(id,employee);
        if(employeeEntity!=null){
            LOGGER.info("Connection updated successfully");
            return ResponseEntity.status(HttpStatus.OK).body(employeeEntity);
        }
        else {
            LOGGER.info("Employee with Employee id"+ id+"Not found");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

    }






    }
