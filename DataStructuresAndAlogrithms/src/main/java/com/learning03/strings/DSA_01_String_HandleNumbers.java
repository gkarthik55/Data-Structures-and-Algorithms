package com.learning03.strings;

public class DSA_01_String_HandleNumbers 
{
	public static void main(String[] args) 
	{
		// You have 2 String variables which contains numbers. Exact the number and calculate the Sum. 
		
		String str1 = "432";
		String str2 = "950";
		
		int sum = Integer.parseInt(str1)+ Integer.parseInt(str2);
		int sum1 = Integer.valueOf(str1) + Integer.valueOf(str2);
		
		System.out.println("Sum :"+ sum);
		System.out.println("Sum :"+ sum1);
	}
}
