package com.learning01.maths;

class DSA_02_BasicMaths_ReverseNumber
{
	public static void main(String args[]) 
	{
		//	Problem Statement: Given an integer N return the reverse of the given number.
		//	Note:  If a number has trailing zeros, then its reverse will not include them. 
		//  Example: reverse of 10400 will be 401 instead of 00401.
			
		//	Example 1:
		//	Input:N = 12345 Output:54321 Explanation: The reverse of 12345 is 54321.
				
		//	Example 2:
		//	Input:N = 7789 Output: 9877 Explanation: The reverse of number 7789 is 9877.

		int num = 10400;
		int reverse = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			reverse = (reverse * 10) + rem;
			
			num = num / 10;
		}
		
		System.out.println("Reverse of the given number :"+reverse);
	}
}