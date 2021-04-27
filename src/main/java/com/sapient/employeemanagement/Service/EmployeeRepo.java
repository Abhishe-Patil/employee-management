package com.sapient.employeemanagement.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.employeemanagement.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

}
