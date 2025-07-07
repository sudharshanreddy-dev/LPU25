package com.lpu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Hostel {
	@TableGenerator(name="allidtable", allocationSize = 1, initialValue = 20)
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "allidtable")
	int hostelid;
	
	String name;

	public int getHostelid() {
		return hostelid;
	}

	public void setHostelid(int hostelid) {
		this.hostelid = hostelid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hostel [hostelid=" + hostelid + ", name=" + name + "]";
	}
	

}
