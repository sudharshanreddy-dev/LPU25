package com.lpu.main;

import java.util.Scanner;

import com.lpu.model.Student;
import com.lpu.service.StudentService;

public class LibraryMain {
	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner =new Scanner(System.in);
		StudentService studentService = new StudentService();
		while(true)
		{
			System.out.println("1 Exit ");
			System.out.println("2 Search a Student");
			System.out.println("3 Add a Student");
			System.out.println("4 Remove Student");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			int roll;
			switch(choice)
			{
			case 1 :
				System.out.println("Bye Bye");
				return;
			case 2 : System.out.println("enter the roll to search");
			roll = scanner.nextInt();
			Student student = studentService.findById(roll);
			if(student != null)
			{
				System.out.println(student);
			}
			else System.out.println("Not found");
			break;
			
			case 3: 
				break;
			case 4 : 
				break;
			}
		}
	}

}
