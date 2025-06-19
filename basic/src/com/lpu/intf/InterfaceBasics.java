package com.lpu.intf;

import java.util.Arrays;

interface Figure 
{
	public static final String COLOR = "BALCK";
	public double area();
	public default void draw() {
		System.out.println("A figure is drawn");
	}
	public static double sum(Figure[] array)
	{
		double s = 0;
		for(Figure fig : array)
		{
			s = s + fig.area();
		}
		return s;
	}
	
}
interface Picture 
{
	double[] dimensions();
}
class Rectangle implements Figure, Picture
{
	double len,wid;

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	@Override
	public double area() { return len * wid; }
	@Override
	public double[] dimensions() {
		return new double[] { len, wid} ;
	}
}
class Circle implements Figure
{
	double rad;
	public Circle(double rad) {
		super();
		this.rad = rad;
	}
	@Override
	public double area() {
		return Math.PI * rad * rad;
	}
}
interface NCCWorker
{
	String getRank(); //cadet, corporal, sergeant
	int getBatch();  //year like 2018, 2019
	String getZone();//north, east,west,south
}

enum Day
{
	SUNDAY("sun", 0), MONDAY("mon", 1), TUESDAY("tue", 2), WEDNESDAY("wed", 3), 
	THURSDAY("thu", 4), FRIDAY("fri", 5), SATURDAY("sat", 6) ;	
	
	public String getNext(int n)
	{
		return "Next";
	}
	
	public final String shorName;
	public final int number;
	private Day(String shorName, int number) {
		this.shorName = shorName;
		this.number = number;
	}
	
	
}
class WeekDay
{
	String name;
	int number;
	public WeekDay(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	
}

public class InterfaceBasics {
	public static void main(String[] args) {
//		Figure f= new Figure(); // error
		WeekDay sunday = new WeekDay("sun", 0);
		
		Day day = Day.MONDAY;
		
		Figure fig;
		Rectangle rec = new Rectangle(5,4);
		fig = rec;
		System.out.println(rec.dimensions());
		Picture pic = rec;
		pic.dimensions();
		
		System.out.println(rec);
		
		
		fig.area();
		
		fig = new Circle(4);
		System.out.println(fig.area());
		
		int[] a = { 3,4,5,6,9};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
	}
}










