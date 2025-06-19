package com.lpu.cal;

import java.time.LocalDate;

class Student 
{
	int roll;
	String name;
	static int nextRoll = 101;
	public Student(String name)
	{
		this.name = name;
		this.roll = nextRoll;
		nextRoll++;
	}
	public void show()
	{
		System.out.println("name=" + name + "  roll = " + roll);
	}
}
public class StaticIdDemo {
	public static void main(String[] args) {
		Student s1 = new Student("Sandeep");
		Student s2 = new Student("Ashish");
		Student s3 = new Student("Ashish");
		
		s1.show(); s2.show(); s3.show();
		
		LocalDate nowTime = LocalDate.now();
		
		java.sql.Date date = java.sql.Date.valueOf(nowTime);
		System.out.println(date);
		java.sql.Date date2 = java.sql.Date.valueOf("2025-06-15");
		System.out.println(date2);
		
		java.util.Date utilDate = new java.util.Date(); 
		System.out.println(utilDate);
		
//		need to covert java.util.Date to java.sql.Date 
//		java.util.Date to java.sql.Date 
//		LocalDate to java.sql.Date 
//		java.sql.Date to LocalDate using factory methods or Constructors
		
		
	}
	
	public void printMonth(int month, int year, int startDay)
	{
//		if startDate = 0 start from Sunday, 1 Monday, 4 Thursday   6 Saturday
//				Sun Mon Tue Wed Thu Fri Sat
//				             1   2   3   4
//				 5   6   7   8   9  10  11
//				 12 13  14  15  16  17  18
	}
	
	
	
	
	
	
	
	
	
	
}
