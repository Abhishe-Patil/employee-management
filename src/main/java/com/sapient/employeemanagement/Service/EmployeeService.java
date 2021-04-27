package com.sapient.employeemanagement.Service;

import com.sapient.employeemanagement.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;


    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepo.findAll();
    }


    public EmployeeEntity saveEmployee( EmployeeEntity employee) {
        EmployeeEntity savedEmployee = employeeRepo.save(employee);
        return savedEmployee;
    }


    public Optional<EmployeeEntity> getEmployeeById(Long id) {
        Optional<EmployeeEntity> employee = employeeRepo.findById(id);

        return employee;

    }

    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }


    public EmployeeEntity updateEmployee(Long id,EmployeeEntity employee){
        Optional<EmployeeEntity> employeeObject= employeeRepo.findById(id);
        EmployeeEntity employeeEntity;
        if(employeeObject.isPresent()){
            employeeEntity=employeeObject.get();
            employeeEntity.setEmp_Firstname(employee.getEmp_Firstname());
            employeeEntity.setEmp_Lastname(employee.getEmp_Lastname());
            employeeEntity.setDomain(employee.getDomain());
            employeeEntity.setCarrierLevel(employee.getCarrierLevel());
            employeeEntity.setStatus(employee.getStatus());
            return employeeRepo.save(employeeEntity);
        }
        return null;

    }

//    public ProjectEntity updateProjectById(Long id, ProjectEntity project){
//        Optional<ProjectEntity> projectObject =  projectRepository.findById(id);
//        ProjectEntity projectEntity;
//        if(projectObject.isPresent()){
//            projectEntity = projectObject.get();
//            projectEntity.setProjectName(project.getProjectName());
//            projectEntity.setClientName(project.getClientName());
//            projectEntity.setStartDate(project.getStartDate());
//            projectEntity.setEndDate(project.getEndDate());
//            return projectRepository.save(projectEntity);
//        }
//        return null;
//    }






}
