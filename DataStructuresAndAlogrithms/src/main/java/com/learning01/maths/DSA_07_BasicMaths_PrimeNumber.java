package com.learning01.maths;

class DSA_07_BasicMaths_PrimeNumber
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given an integer N, check whether it is prime or not. 
		// A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.
		
		//Example 1: Input:N = 2 Output:True  
		//Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
		
		//Example 2: Input:N =10 Output: False
		//Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.

		int num = 5;
		double sq = Math.sqrt(num);
		
		int count = 0;
		
		for(int i=1; i<=sq; i++)
		{
			int rem = num % i;
			
			if(rem == 0)
			{
				count++;
				
				if(num/i != i)
				{
					count++;
				}
			}
		}
		
		if(count == 2)
		{
			System.out.println("The given number is a Prime number.");
		}
		else
		{
			System.out.println("The given number is not a Prime number.");
		}
	}
}