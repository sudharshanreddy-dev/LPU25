package com.lpu.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int isid;
	int bid;
	int roll;
	Date isdate, expretdate;
	Double fine;
	@Override
	public String toString() {
		return "Issue [isid=" + isid + ", bid=" + bid + ", roll=" + roll + ", isdate=" + isdate + ", expretdate="
				+ expretdate + ", fine=" + fine + "]";
	}

}
