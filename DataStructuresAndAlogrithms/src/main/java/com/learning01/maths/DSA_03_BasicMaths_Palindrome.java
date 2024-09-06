package com.learning01.maths;

class DSA_03_BasicMaths_Palindrome
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given an integer N, return true if it is a palindrome else return false.
				
		// A palindrome is a number that reads the same backward as forward. 
		// For example, 121, 1331, and 4554 are palindromes because they remain the same when their digits are reversed.
				
		//	Example 1:
		//	Input:N = 4554
		//	Output:Palindrome Number
		//	Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number
				
		//	Example 2:
		//	Input:N = 7789
		//	Output: Not Palindrome
		//	Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome
				
		int num = 4554;
		int dupNum = num;
		int reverse = 0;
		
		while(dupNum > 0)
		{
			int rem = dupNum % 10;
			reverse = (reverse * 10) + rem;
			
			dupNum = dupNum / 10;
		}
		
		if(num == reverse)
		{
			System.out.println("The given number is a Palindrome.");
		}
		else
		{
			System.out.println("The given number is not a Palindrome.");
		}
	}
}