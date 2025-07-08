package com.lpu.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Parking {
	@SequenceGenerator(name ="parkingidseq", initialValue = 1101, allocationSize = 1)
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "parkingidseq")
	int parkingid;
	Integer floor;
	Integer place;
	
//	@JoinColumn(name = "empid") // if not given employee_empid will be column
	@OneToOne(fetch = FetchType.EAGER)
	Employee employee; // HIb will add foreign key employee_empid in Parking table
	
	
//	int empid;
	
	public int getParkingid() {
		return parkingid;
	}
	public void setParkingid(int parkingid) {
		this.parkingid = parkingid;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getPlace() {
		return place;
	}
	public void setPlace(Integer place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Parking [parkingid=" + parkingid + ", floor=" + floor + ", place=" + place + "]";
	}
	
	
	
}
