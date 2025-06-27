package com.lpu.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lpu.model.Student;

public class StudentDao {
	private static Map<Integer, Student> students = new HashMap<>();// control shift O
	static
	{
		// to initialize static data we can use static block
		// like constructor initializes object
		students.put(101, new Student(101, "Amit", "CSE", "9865986558"));
		students.put(102, new Student(102, "Sumit", "CSE", "9865986008"));
		students.put(103, new Student(103, "Geeta", "CSE", "9865986555"));
		students.put(104, new Student(104, "Deepak", "CSE", "9865986557"));
	}
	public List<Student> findAll()
	{		
		return new ArrayList<>(students.values());
	}

	public Student findById(int roll)
	{
		return students.get(roll);
	}
	public boolean removeById(int roll)
	{
		try
		{
			Student oldStudent = students.remove(roll);
			if(oldStudent == null) return false;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public Student update(Student student)
	{
		if(! students.containsKey(student.getRoll() ) )
				throw new RuntimeException("Student with roll " + student.getRoll() + " does not exist");
		students.put(student.getRoll(), student);
		return student;
	}
	public Student add(Student student)
	{

		if(students.containsKey(student.getRoll()) )
				throw new RuntimeException("Student with roll " + student.getRoll() + "  exists, Can't Add");
		students.put(student.getRoll(), student);
		return student;
	}


}
