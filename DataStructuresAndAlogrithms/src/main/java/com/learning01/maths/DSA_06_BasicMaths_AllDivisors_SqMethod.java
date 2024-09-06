package com.learning01.maths;

import java.util.SortedSet;
import java.util.TreeSet;

class DSA_06_BasicMaths_AllDivisors_SqMethod
{
	public static void main(String args[]) 
	{
		// Problem Statement: Given an integer N, return all divisors of N.
		// A divisor of an integer N is a positive integer that divides N without leaving a remainder. 
		
		// In other words, if N is divisible by another integer without any remainder, then that integer 
		// is considered a divisor of N.
		
		// Example 1: Input:N = 36 Output:[1, 2, 3, 4, 6, 9, 12, 18, 36] 
		// Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.

		// Example 2: Input:N =12  Output: [1, 2, 3, 4, 6, 12] 
		// Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.

		int num = 36;
		double sq = Math.sqrt(num);
		
		SortedSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=1; i<=sq; i++)
		{
			int rem = num % i;
			
			if(rem == 0)
			{
				System.out.println(i);
				set.add(i);
				
				if(num/i != i)
				{
					System.out.println(num/i);
					set.add(num/i);
				}
			}
		}
		
		System.out.println("All divisors of N :"+set);
	}
}