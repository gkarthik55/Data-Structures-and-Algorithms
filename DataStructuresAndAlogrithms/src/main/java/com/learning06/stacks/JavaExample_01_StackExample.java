package com.learning06.stacks;

public class JavaExample_01_StackExample
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		
		stack.show();
		
		//Push Elements
		stack.push(5);
		stack.push(8);
		stack.push(3);
		
		stack.show();
		
		//Push one more Element
		stack.push(2);
		
		stack.peek();
		
		//Pop Element
		stack.pop();
		
		stack.show();
	}
}
