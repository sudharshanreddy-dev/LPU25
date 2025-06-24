package com.lpu.coll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Point
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
	public boolean equals(Object ob)
	{
		// 2 objects to compare this, obj
		System.out.println("calling equals for " + this  + " and " + ob);
		if(! (ob instanceof Point) )
		{
			return false;
		}
		Point p = (Point) ob;
		if(this.x == p.x && this.y == p.y) return true;
		else return false;
	}
	@Override
	public int hashCode()
	{
		return x;
	}
	
}



public class SetDemo {
	
	class MyList
	{
		Object ar[] = new Object[100];
		public boolean contains(Object obj)
		{
			for(int i = 0; i<ar.length; i++)
			{
//				if(ar[i] == obj) return true;
				if(ar[i].equals(obj)) return true;
				
			}
			return false;
		}
	}
	public static void main(String[] args) {
		List<Point> pointsList = new ArrayList<>();
		System.out.println("hello");
		pointsList.add(new Point(2,3));
		pointsList.add(new Point(1,3));
		pointsList.add(new Point(2,3));
		pointsList.add(new Point(6,7));
		pointsList.add(new Point(4,4));
		
		boolean contains = pointsList.contains(new Point(1,3));
		System.out.println("contains = " + contains);
		
		Set<Point> pointsSet = new HashSet<>();
		pointsSet.add(new Point(2,3));
		pointsSet.add(new Point(1,3));
		pointsSet.add(new Point(2,3));
		pointsSet.add(new Point(6,7));
		pointsSet.add(new Point(4,4));
		System.out.println("size of set = " + pointsSet.size());
		
		contains = pointsList.contains(new Point(1,3));
		System.out.println("set contains = " + contains);
		
		
		
		
	}
	public static void setMethod()
	{
		Set<String> set =new HashSet<>(); // control + shift + O to Organize the imports
//		{1,2,3} U { 3,4,5} = { 1,2,3,4,5}; // not repated elements 
		
		List<String> list = new ArrayList<>();
		list.add("Amit");
		list.add("Sumit");
		list.add("Amit");
		System.out.println("list size = " + list.size());
		
		boolean added = set.add("Amit"); System.out.println(added);
		added = set.add("Sumit"); System.out.println(added);
		added = set.add("Amit"); System.out.println(added);
		System.out.println("set size = " + set.size());
		
		for(int i = 0 ;i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		for(String str : list) System.out.println(str);
		System.out.println();
		for(String str : set) { System.out.println(str);}
		
		set.add("Ankit");
		set.add("Shubham");
		set.add("Krishan");
		set.add("Keerti");
		System.out.println(set);
		
		String word= "ostentatious";
		Set<Character> setChars = new HashSet<>();
		for(int i = 0; i<word.length(); i++)
		{
			setChars.add(word.charAt(i));
		}
		System.out.println("chars used are "  + setChars);
		// how many different charcters were used to create this string
		String line = "this is word this is new line word is great hello new what is date";
		// Find the words that occured only once in this line 
//		line, great hello what date 
		String[] words = line.split(" ");
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for(String w : words)
		{
			boolean add = set1.add(w);
			if(!add) //repeated word
			{
				set2.add(w); // set2 contains repeated words
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2); //removea all repeated words
		System.out.println(set1);

	}

}
