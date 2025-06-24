package com.lpu.coll;


class GenericStack<T>
{
	Object[] a = new Object[10];
	int top = -1;
	public void push(T x)
	{
		if(top == a.length -1 )
		{
			throw new RuntimeException("Overflow");
		}
		a[++top]  = x;
	}
	public T pop()
	{
		if(top == -1)
		{
			throw new RuntimeException("Underflow");
		}
		return (T) a[top--];
	}
}
public class GenericDemo {
	public static void main(String[] args) {
		GenericStack<Integer> stk = new GenericStack();
		stk.push(5); stk.push(88); stk.push(39);
		System.out.println(stk.pop());
		
	}

}
