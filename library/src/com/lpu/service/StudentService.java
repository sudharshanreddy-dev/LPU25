package com.lpu.service;

import com.lpu.dao.StudentDao;
import com.lpu.model.Student;

public class StudentService {
	StudentDao sdao = new StudentDao();
	public Student findById(int roll)
	{
		return sdao.findById(roll);
	}
	public boolean removeById(int roll)
	{
		return sdao.removeById(roll);
	}
	public Student addStudent(Student student)
	{
		return sdao.add(student);
	}	
}
