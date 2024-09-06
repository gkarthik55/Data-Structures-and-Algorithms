package com.learning01.maths;

class DSA_04_BasicMaths_ArmstrongNumber
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.
		// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the 
		// power of the number of digits.
			
		// Examples
		// Example 1: Input:N = 153 Output:True
		// Explanation: 13+53+33 = 1 + 125 + 27 = 153
				
		// Example 2: Input:N = 371 Output: True
		// Explanation: 33+53+13 = 27 + 343 + 1 = 371

		int num = 372;
		int dupNum = num;
		int sum = 0; 
		
		while(dupNum > 0)
		{
			int rem = dupNum % 10;
			sum = sum + (rem * rem * rem);
			
			dupNum = dupNum / 10;
		}
		
		if( sum == num)
		{
			System.out.println("The given number is an Armstrong number.");
		}
		else
		{
			System.out.println("The given number is not an Armstrong number.");
		}
		
	}
}