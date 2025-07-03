package lpu.com.thr;
class Hare extends Thread
{
	public void run()
	{
		for(int i = 1; i<=90; i++)
		{
			System.out.println("Hare " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 91; i<=100; i++)
		{
			System.out.println("Hare " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Tortoise extends Thread
{
	public void run()
	{
		for(int i = 1; i<=100; i++)
		{
			System.out.println("Tortoise " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class HareAndTortoise {
	public static void main(String[] args) {
		Hare h =new Hare();
		Tortoise t =new Tortoise();
		h.start();
		t.start(); 
	}

}
