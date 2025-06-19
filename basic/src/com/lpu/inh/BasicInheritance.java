package com.lpu.inh;
class Person
{
	String name;
	String address;
	public void showPerson()
	{
		System.out.println("name" + name + "  address " + address);
	}
//	public void showPerson(Person this)
//	{
//		System.out.println("name" + this.name + "  address " + this.address);
//	}
//	public Person()
//	{
//		System.out.println("Person created");
//	}
	public Person (String name, String address)
	{
		this.name = name;
		this.address = address;
		System.out.println("Person created with data");
	}
	public void show()
	{
		System.out.println("name" + name + "  address " + address);
	}
}
class Student extends Person
{
	int roll;
	String branch;
	public Student(String name, String address, int roll, String branch)
	{
		super(name, address); //call the super class constructor to initialize super object data memebers
		this.roll = roll;
		this.branch = branch;
		System.out.println("Student created");
	}
	public void showStudent()
	{
		System.out.println(super.name + "," + super.address +"," +  this.roll + "," + this.branch);
		System.out.println(name + ","+ address +"," +  roll + "," + branch);
		
	}
	public void show()
	{
		System.out.println(name + ","+ address +"," +  roll + "," + branch);
	}
}

public class BasicInheritance {
	public static void main(String[] args) {
		Person p1 = new Person("Sumit", "Jalandhar"); p1.name="Sumit";
		Person p2 = new Person("Rajan", "Delhi"); p2.name = "Rajan";
		p1.showPerson();
		p2.showPerson();
		Student s1 = new Student("Keerti","Telangana", 125, "CSE" );
		s1.showPerson();
//		s1 = p1; // ERROR 
		p1.show();
		
		p1 = s1; // no error Base class var = Derived class Object
		Person p3 = new Student("A","b", 5, "A");
		
		p1.name = "new name";
		p1.showPerson();
//		p1.roll = 999; // ERROR
		
		p1.show(); // this function will be called from which class 
		
	}
}
