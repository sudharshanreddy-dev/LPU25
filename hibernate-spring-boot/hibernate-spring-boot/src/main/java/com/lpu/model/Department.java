package com.lpu.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Department {

	@SequenceGenerator(name="depidseq", initialValue = 501, allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	int depid;
	String name;
	
	//mappedBy = Name of data member in the target class for this class
	@OneToMany (mappedBy = "department")
	Set<Employee> employees = new HashSet<>();
	
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", name=" + name + "]";
	}
	public Department(int depid, String name) {
		super();
		this.depid = depid;
		this.name = name;
	}
	public Department() {
		super();
	}
	
}
