package com.lpu.inh;
class Figure
{
	public double area() { return 0; }
}
class Rectangle extends Figure
{
	double len, wid;

	public Rectangle(double len, double wid) {
		super();
		this.len = len;
		this.wid = wid;
	}
	@Override
	public double area()
	{
		return len * wid;
	}
}
class Circle extends Figure
{
	double rad;

	public Circle(double rad) {
		super();
		this.rad = rad;
	}
	@Override
	public double area()
	{
		return Math.PI * rad * rad;
	}
}
public class FigureDemo {
	public static void main(String[] args) {
		Figure f1 = new Figure();
		Figure f2 = new Figure();
		System.out.println(f1.area());
		
		Rectangle r1 =new Rectangle(5,4);
		Rectangle r2 =new Rectangle(5,3);
		System.out.println(r1.area());
		
		Circle c1 = new Circle(7);
		Circle c2 = new Circle(2);
		System.out.println(c1.area());
		
		f1 = r1;
		System.out.println(f1.area());
		double s = sum(f1,f2); System.out.println(s);
		s = sum(r1,r2); System.out.println(s);
		s = sum(f1,r1); System.out.println(s);
		s = sum(r1, c1); System.out.println(s);
		
		Figure ar[] = { f1, r1,r2, c1, c2 };
		ar[0] = f1;
		ar[1] = r1;
		ar[2] = r2;
		double sumAr = sum(ar);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static double sum(Figure f1, Figure f2)
	{
		return f1.area() + f2.area();
	}
}








