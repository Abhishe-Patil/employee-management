package com.sapient.employeemanagement.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long emp_id;
	private String emp_Firstname;
	private String emp_Lastname;
	private String carrierLevel;
	private String domain;
	private String status;
	
	
	
	public EmployeeEntity() {
		super();
	}
	
	
	public EmployeeEntity(Long emp_id, String emp_Firstname, String emp_Lastname, String carrierLevel, String domain,
			String status) {
		super();
		this.emp_id = emp_id;
		this.emp_Firstname = emp_Firstname;
		this.emp_Lastname = emp_Lastname;
		this.carrierLevel = carrierLevel;
		this.domain = domain;
		this.status = status;
	}


	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_Firstname() {
		return emp_Firstname;
	}
	public void setEmp_Firstname(String emp_Firstname) {
		this.emp_Firstname = emp_Firstname;
	}
	public String getEmp_Lastname() {
		return emp_Lastname;
	}
	public void setEmp_Lastname(String emp_Lastname) {
		this.emp_Lastname = emp_Lastname;
	}
	public String getCarrierLevel() {
		return carrierLevel;
	}
	public void setCarrierLevel(String carrierLevel) {
		this.carrierLevel = carrierLevel;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
