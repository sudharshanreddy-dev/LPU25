package com.lpu.inh;
class Account extends Object
{
	int acno;
	static int nextAcNo = 1101;
	double balance;
	
//	Anonymous Constructor : is part of every constructor
	// it will execute automatically before every constructor
	{
		acno = nextAcNo++;
		System.out.println("Anonymous constructor called");
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public Account() {
		balance = 0;
	}
	public void deposit(double amt)
	{
		balance = balance + amt;
		System.out.println(amt + " added");
	}
	public void withdraw(double amt)
	{
		balance = balance - amt;
		System.out.println(amt + " subtracted");
	}
}
class SavingAc extends Account 
{
	
	//create 2 constructors here
	public SavingAc(double balance) {
		super(balance);
	}
	
	String debitCard;
	public double minBalanceFine() { return 100; }
	@Override
	public int hashCode()
	{
		return 1;
	}
	@Override
	public String toString()
	{
		return "Saving Account with balance = " + balance;
	}
	@Override 
	public boolean equals(Object obj)
	{
//		2 objects to compare are : this, obj
		if(obj.getClass() == this.getClass())
		{
			SavingAc acc = (SavingAc) obj;
			if(this.acno == acc.acno) return true;
			else return false;
		}
		return super.equals(obj);
	}
}
class JanDhanAccount extends SavingAc
{
	
	public double minBalanceFine() { return 0; }
	// create 2 constructor here as well
	public JanDhanAccount(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double amt)
	{
		System.out.println("jan dhan deposit rules will be checked");
		// check the total in year if total + amt > 1L do the needful
		//else
		super.deposit(amt);
	}
	
}
class Point
{
	int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override 
	public boolean equals(Object ob)
	{
		if(this.getClass() == ob.getClass())
		{
			Point p = (Point ) ob;
			if(this.x == p.x && this.y == p.y)return true;
			return false;
		}
		return false;
	}
	@Override
	public String toString()
	{
		return "Point(" + x + "," + y + ")";
	}
}
public class Bank {
	public static void main(String[] args) {
		SavingAc s1 = new SavingAc(1000);
		SavingAc s2 = new SavingAc(45000);
		SavingAc s3 = new SavingAc(50000);
		
		JanDhanAccount j1 = new JanDhanAccount(7800);
		s1.deposit(2000);
		j1.deposit(3000);
		
		Object obj = s1;
//		Base class variable = Derived class Object 
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj.equals("Hello"));
		
		
		Point p1 = new Point(2,3);
		Point p2 = new Point(6,5);
		Point p3 = new Point(6,5);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println(p2 == p3);
		System.out.println(p2.equals(p3));
		
		
		
	}
}

