


package com.lpu.main;

import java.io.PrintStream;

public class Hello {
	public static void main(String args[])
	{
		// static method can call only static methods
		int x = fact(5);
//		int y = sum(4,5); // error : static method can not call non static
		Hello obj = new Hello();
		int z = obj.sum(4, 5);
		
		
	}
	
	
	public static int fact(int n)
	{
		int p = 1;
		for(int i = 1; i<=n; i++) { p = p*i;}
		return p;
	}
	int sum(int a, int b)
	{
		return a + b;
	}

}
class System 
{
	public static PrintStream out;
}