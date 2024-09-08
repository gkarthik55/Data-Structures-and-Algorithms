package com.learning06.stacks;

public class JavaExample_02_StackExample
{
	public static void main(String[] args) 
	{
		DynStack obj = new DynStack();
		obj.push(15);
		obj.push(8);
		obj.push(10);
		obj.push(2);
		obj.push(6);
		
		obj.show();
		
		obj.pop();
		obj.pop();
		obj.pop();
	}
}
