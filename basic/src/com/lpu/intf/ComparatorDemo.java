package com.lpu.intf;

import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparable<Point>
{
	int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Point o) {
		// 2 points : this and o
		if(this.x > o.x) return +1;
		else if(this.x < o.x)return -1;
		else return 0;
	}
	
}
public class ComparatorDemo {
	public static void main(String[] args) {
		Point[] ar = { new Point(3,4), new Point(7,3), new Point(1,1), new Point(3,9)};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		class PointComparator implements Comparator<Point>
		{
			@Override
			public int compare(Point o1, Point o2) {
//				if(o1.y > o2.y ) return +ve;
//				if(o1.y < o2.y ) return -ve;
//				else return 0;
//				
				return o1.y - o2.y ;
			}
		}
		PointComparator comp = new PointComparator();
				
		Arrays.sort(ar, comp);
		System.out.println(Arrays.toString(ar));
		
	}

}

class Student
{
	int roll;
	String name;
	int marks;
	int rank;
	public Student(int roll, String name, int marks, int rank) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", rank=" + rank + "]";
	}
	
}














