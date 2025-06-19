package com.lpu.main;

public class ArrayProblems {
	public static void main(String[] args) {
		int[] ar = new int[10];
		int br[] = new int[5];
		int[] cr = { 2,3,4,5,1,2,7,6,4,3};
//					  1	1 1 4 1 5 1 2 1   => max difff = 5
		reverseArray(cr);
		reverseArray(cr, ar); // OVERLOADING, COMPILE TIME POLYMORPHISM
		int maxdiff = maxDifference(cr); 
		System.out.println("max diff = " + maxdiff);
		
		boolean valid = validDate(30, 4, 2025); 
		valid = validDate(29, 2, 2025);
		valid = validDate(29, 2, 2025); // control + alt + down: duplicate line
//		control d : delete line Control 1, control space
		
	}
	private static boolean validDate(int i, int j, int k) {
		return false;
	}
	private static int maxDifference(int[] a) {
		int maxDiff = Integer.MIN_VALUE;
		for(int i = 0 ;i<a.length -1; i++)
		{
			int diff = Math.abs(a[i] - a[i+1]) ;
			if(diff > maxDiff)
			{
				maxDiff = diff;
			}
		}
		return maxDiff;
//		a0 - a1 
//		a1 - a2
//		a2 - a3
//		
//		
//		a 8 - a 9
//		return 0;
	}
	private static void reverseArray(int[] cr, int[] ar) {
		// THIS WILL COPY THE CR ARRAY IN REVERSEE ORDER TO AR
		int j = cr.length-1;
		for(int i = 0; i<cr.length ; i++)
		{
			ar[i] = cr[j];
			j--;
		}
		for(int i = 0; i<cr.length ; i++)
		{
			ar[i] = cr[cr.length - 1 - i ];
		}
//		  i     j
//		a 0 = c 9
//		a 1 = c 8 
//		a 2 = c 7 
//		
//		
//		a 8 = c 1
//		a 9 = c 0 
//		j = 9
//		from i = 0 to 10 , i++, j--
//			a[i] = c[j]
		
	}
	private static void reverseArray(int[] array) {
		for(int i = 0 ; i<array.length/2 ;i++)
		{
			int t = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = t;
		}
//		CHANGE THE ELEMENTS OF CR TO REVERSE THE ARRAY
//		2 3 4 1 6 7 8 6 5 85 4
//		4 85 5 6
//		swap a 0 with a 9
//		swap a 1 with a 8
//		swap a 2 with a 7 
//		how many swappings ? N/2
		
	}

}
