package com.lpu.str;

public class StringDemo {
	public static void main(String[] args) {
		String str = "  this is   a   string  ";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		str = str.concat(" new string added");
		System.out.println(str);
		System.out.println(str.contains("is"));
		System.out.println(str.startsWith("this"));
		System.out.println(str.endsWith("string"));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 7));
		System.out.println(str.equals("this"));
		System.out.println(str.indexOf("is"));
		System.out.println(str.toUpperCase());
		
		String[] words = str.split(" "); //control 2 + L
		for(String word : words)
		{
			System.out.println(word);
		}
		String names = "amit, sumit, rajan,dinesh,deepak,sunita,deepti,krishna, ram";
		String[] namesAr = names.split(",");
		for(String name : namesAr)
		{
			System.out.println(name);
		}
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}

}
