
package com.lpu.coll;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ListDemo {
	public static void printFile(String fileName) throws IOException
	{
		FileReader fr = new FileReader(fileName);
		Scanner sc = new Scanner(fr);
		while(sc.hasNext())
		{
			String str = sc.next();
			System.out.println(str + " ");
		}
		sc.close();
		fr.close();
		
	}
	public static void main(String[] args) throws IOException 
	{
		printFile("src/com/lpu/coll/GenericDemo.java");
		// Collection 
		Collection<Integer> coll;
		List<Integer> list = new ArrayList<>();
		list.add(98);
		for(int i = 34; i> 28; i--) list.add(i);
		list.add(999);
		
		
		System.out.println("size=" + list.size());
		System.out.println(list.get(0));
		for(int i = 0;i<list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		for(int x : list)
			System.out.print(x + " ");
			
		System.out.println();
		Integer y = 32;
		list.remove(y);
		list.remove(0);
		for(int x : list)
			System.out.print(x + " ");
		
		System.out.println();
		
		
		
		System.out.println();
		System.out.println();
		
	}

}
