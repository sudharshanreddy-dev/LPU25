package lpu.com.thr;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class CounterThread extends Thread
{
	String file;
	int count = 0;

	public CounterThread(String file) {
		super();
		this.file = file;
	}
	public void run()
	{
		File fileInfo = new File(file);
		Scanner sc = null;
		try {
			sc = new Scanner(fileInfo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int count = 0;
		while(sc.hasNext())
		{
			sc.next(); count++;
		}
		System.out.println(file + ":" + count);
		this.count = count;
	}
}
public class FileCount {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.out.println("Current thread = " + Thread.currentThread());
		
		File dirInfo = new File("."); // . means current folder
		System.out.println(dirInfo.getAbsolutePath());
		System.out.println(dirInfo.isDirectory());
		System.out.println(dirInfo.isFile());
		System.out.println(dirInfo.exists());
		String[] files = dirInfo.list();
		List<CounterThread> counterList = new ArrayList<>();
		
		for(String file : files)
		{
			if(file.startsWith("a") && file.endsWith(".txt"))
			{
				System.out.println("Processing " + file);
				CounterThread t = new CounterThread(file);
				counterList.add(t);
				t.start();
			}
		}
		for(CounterThread t : counterList)
		{
			t.join();
		}
		
		System.out.println();
		
		File fileInfo = new File("a1.txt");
		System.out.println(fileInfo.getAbsolutePath());
		System.out.println(fileInfo.exists());
		System.out.println(fileInfo.length());
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		sc =new Scanner("some string");
		sc = new Scanner(fileInfo);
		sc = new Scanner (new FileReader(fileInfo));
		
		// find all files whose name start with "a" and endswith ".txt" : 3 files  
		// create 3 threads , each thread counts the number of words in each file
		// get the sum of all the word count in main and print it
		
		
		
		
	}

}
