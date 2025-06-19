package com.lpu.ex;
public class StackInt
{
	public static void main(String[] args) {
		StackInt stk = new StackInt();
		stk.push(34); stk.push(9); stk.push(-1); stk.push(0); stk.push(2);
		int x = stk.pop();
		while(x != -1)
		{
			System.out.println(x);
			x = stk.pop();
		}
	}
	int[] a;
	int top = -1;
	public void push(int x)
	{
		if(top == a.length -1)
		{
			System.out.println("Overflow: can not push");
			return;
		}
		a[++top] = x;
	}
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Underflow : can not pop");
			return -1;
		}
		return a[top--];
	}
}






