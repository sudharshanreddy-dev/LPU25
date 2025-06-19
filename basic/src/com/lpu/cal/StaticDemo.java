package com.lpu.cal;

class Point
{
	int x, y;
	static int orgx, orgy;
	public void show()
	{
		System.out.println(x + "," + y + "," + orgx + "," + orgy);
		
	}
	public static void showOrigins()
	{
		System.out.println(orgx + "," + orgy);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		p1.x = 1; p1.y = 1; p1.orgx = 10; p1.orgy = 10;
		p2.x = 2; p2.y = 2; p2.orgx = 20; p2.orgy = 20;
		
		Point.orgx = 20;
		Point.orgy = 20;
		Point.showOrigins();
		
		
		System.out.println(p1.x + "," + p1.y + ","+p1.orgx + "," + p1.orgy);
		System.out.println(p2.x + "," + p2.y + ","+p2.orgx + "," + p2.orgy);
		 
	}

}
