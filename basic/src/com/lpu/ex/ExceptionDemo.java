package com.lpu.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class BigNumberException extends Exception 
{
}
public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=0, y=0, z=0;
		try
		{
			System.out.println("enter 2 integers in the range of 1 to 100");
			x = sc.nextInt();
			y = sc.nextInt();
			if(x > 100 || y > 100) {
				BigNumberException e = new BigNumberException();
				throw e;
			}
			z = x/y;
			System.out.println("quotient = " + z);
			System.out.println("done");

		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("can not divide by zero, setting z to max value");
			z = Integer.MAX_VALUE;
		}
		catch(Exception e)
		{
			System.out.println("some error occured " + e);
		}
		finally
		{
			System.out.println("this will code will always run, either exception occurs of does not ");
		}
		System.out.println("finally z = " + z);
	}
	public static void copyFile(String inputFile, String outputFile) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fout = new FileOutputStream(outputFile);
		int ch = fis.read();
		while(ch != -1)
		{
			fout.write(ch);
			ch = fis.read();
		}
		
	}

}










