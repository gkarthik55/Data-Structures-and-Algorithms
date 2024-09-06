package com.learning01.maths;

class DSA_01_BasicMaths_CountDigits
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given an integer N, return the number of digits in N. 
				
		// Example 1: Input: N = 12345 Output: 5 Explanation: The number 12345 has 5 digits.
		// Example 2: Input: N = 7789 Output: 4 Explanation: The number 7789 has 4 digits.

		int num = 7789;
		int count = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			num = num / 10;

			count = count + 1;
		}
		
		System.out.println("Number of Digits : "+count);
		
		//Approach 2
		int num2 = 12345;
		long count2 = (long)Math.log10(num2) + 1;
		System.out.println("Number of Digits for Num2: "+count2);
	}
}