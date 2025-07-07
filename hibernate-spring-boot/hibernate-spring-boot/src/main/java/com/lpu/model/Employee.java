package com.lpu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	int empid;
	String name, designation;
	
//	Employee	Many in One		Department
	
	@ManyToOne
	@JoinColumn(name="depid") // if not given  FK Name department_depid
	Department department; 
	
	Integer mgrid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public Integer getMgrid() {
		return mgrid;
	}
	public void setMgrid(Integer mgrid) {
		this.mgrid = mgrid;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", department="
				+ department.getName() + ", mgrid=" + mgrid + "]";
	}
	
	
}
