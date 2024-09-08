package com.learning06.stacks;

public class DynStack 
{
	int capacity=2;
	int stack[] = new int[capacity];
	int top=0;

	public void push(int data)
	{
		System.out.println("Pushing the Element :"+data);
		
		if(top >= stack.length)
		{
			capacity = capacity*2; 
			int newStack[] = new int[capacity];
			
			System.arraycopy(stack, 0, newStack, 0, top);
			stack = newStack;
			
			System.out.println("Capacity has Increased.");
		}
		
		stack[top] = data;
		top++;
	}
	
	public void pop() 
	{
		System.out.println("Popping the Element..");
		
		boolean empty = isEmpty();
		
		if(empty)
		{
			System.out.println("Popping of the Element is not Possible.");
		}
		else
		{
			int data = stack[top-1];
			
			stack[top-1] = 0; // Setting zero.
			top--;
			
			System.out.println("Element "+data+" is Popped.");
			
			if(top <= (capacity/2)/2)
			{
				int newStack[] = new int[capacity/2];
				System.arraycopy(stack, 0, newStack, 0, top);
				
				stack = newStack;
				
				System.out.println("Shrink is Successful.");
			}
		}
	}
	
	public void peek() 
	{
		System.out.println("\nPeaking the Stack..");
		
		boolean empty = isEmpty();
		
		if(empty == false)
			System.out.println(stack[top-1]);
	}
	
	public void show()
	{
		System.out.println("\nStack Elements :");
		System.out.println("-------------------------------");
		isEmpty();
		
		for(int i=0; i<stack.length; i++)
		{
			System.out.print("["+stack[i]+"]");
		}
		System.out.println();
	}
	
	public boolean isEmpty()
	{
		if (top == 0)
		{
			System.out.println("Stack is Empty.");
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return top;
	}
}
