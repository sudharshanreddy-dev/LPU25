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
		String marks="34,56, 57, 8, 3,6,4,6, 6,6";
		String[] nums = marks.split(",");
		int s = 0; 
		for(String num : nums)
		{
			int x = Integer.parseInt(num.trim());
			s = s + x;
		}
		System.out.println("sum = " + s);
		 
		// calculate the sum of all integers in the string
		/*
		 * 1. String sentence = “this is line. Line contains few words. Line is in java” 
Positions of “line” : 8, 14, 39
2. Date is given in different formats
Input				output expected
	12 - 4-1978			12041978
	21.4.2001			21042001
	5-6-99				05061999
	04-11-01				04112001
3. Convert a given string to title case:
This is java lang -> This Is Java Lang

		 */
		
		
		String alpha = "";
		for( char ch = 'A' ; ch <= 'Z'; ch++)
		{
			alpha += ch;
		}
		System.out.println(alpha);
		StringBuilder sb = new StringBuilder();
		for( char ch = 'A' ; ch <= 'Z'; ch++)
		{
			sb.append(ch);
		}
		System.out.println(sb);
		System.out.println();
		
		
	}
	public static String converDate(String date)
	{
		// 12.4.98 or 12 - 4- 1978 or 12.04.01
		String[] parts = date.split("[.]");
		if(parts.length == 3)
		{
			
		}
		else
		{
			parts = date.split("-");
		}
		String dayStr = parts[0].trim(); 
		if(dayStr.length() == 1) dayStr = "0" + dayStr;
		
		String monStr = parts[1].trim(); 
		if(monStr.length() == 1) monStr = "0" + monStr;
		
		String yearStr = parts[2].trim(); 
		if(yearStr.length() == 2) {
			if(Integer.parseInt(yearStr) > 25)
				yearStr = "19" + yearStr;
			else yearStr= "20" + yearStr;
		}
		return dayStr + monStr + yearStr;
		
	}
	

}














