package com.learning03.strings;

// Program to Calculate the Sum in the given String which is commas separated.
// Ex: String str="9,99,9,99"; output:216

public class DSA_03_String_SumCommaSeperated 
{
	public static void main(String[] args) 
	{
		String str="9,99,19,999";
		
		calculateSum(str);
	}
	
	public static void calculateSum(String strValue)
	{
		int sum = 0;
		
		String strArr[] = strValue.split(",");
		
		for(String str : strArr)
		{
			sum = sum + Integer.valueOf(str);
		}
		
		System.out.println("Total sum : "+sum);
	}
}
