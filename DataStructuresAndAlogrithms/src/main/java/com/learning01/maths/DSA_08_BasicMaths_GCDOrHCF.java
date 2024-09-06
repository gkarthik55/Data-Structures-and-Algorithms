package com.learning01.maths;

class DSA_08_BasicMaths_GCDOrHCF
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.
		// The Greatest Common Divisor of any two integers is the largest number that divides both integers.
		
		// Example 1: Input: N1=9, N2=12 Output:3
		// Explanation: Factors of 9: 1, 3 and 9 	Factors of 12: 1, 2, 3, 4, 6, 12
		// Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
		
		// Example 2:
		// Input:N1 = 20, N2 = 15
		// Output: 5
		// Explanation: Factors of 20: 1, 2, 4, 5 Factors of 15: 1, 3, 5
		// Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

		int num1 = 9;
		int num2 = 12;
		int minVal = Math.min(num1, num2);
		
		for(int i=minVal; i>= 1; i--)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				System.out.println("GCD of the given two integers is "+i);
				break;
			}
		}
	}
}