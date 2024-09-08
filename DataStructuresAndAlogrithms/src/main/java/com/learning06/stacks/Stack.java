package com.learning06.stacks;

public class Stack 
{
	int stack[] = new int[3];
	int top=0;
	
	int len = stack.length;

	public void push(int data) 
	{
		System.out.println("Pushing the Element :"+data);
		
		if(top == len)
		{
			System.out.println("Stack Overflow! Stack is Full.");
		}
		else
		{
			stack[top] = data;
			top++;
		}
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
		
		for(int i=0; i<top; i++)
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
}
