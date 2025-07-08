package com.lpu;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int roll;
	String sname, branch, phone;
	Date dob;
	Integer marks;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", branch=" + branch + ", phone=" + phone + ", dob=" + dob
				+ ", marks=" + marks + "]";
	}
	

}
