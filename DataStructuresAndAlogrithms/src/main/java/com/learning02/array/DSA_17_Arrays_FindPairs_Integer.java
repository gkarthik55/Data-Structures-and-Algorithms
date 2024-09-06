package com.learning02.array;

import java.util.Arrays;

// Find all pairs of an integer array whose sum is equal to a given number.
// Time complexity is O(n)

class DSA_17_Arrays_FindPairs_Integer
{
	public static void main(String args[]) 
	{
		int array[] = { 2, 4, 7, 5, 9, 10, -1 };
		
		findPairs(array, 9);
	}
	
	public static void findPairs(int numbers[], int number)
	{
		Arrays.sort(numbers);
	
		int begin = 0;
		int end = numbers.length-1; 
		
		for(int i=begin; i<= end; i++)
		{
			if( numbers[begin] + numbers[end] == number )
			{
				System.out.println("Pair :"+numbers[begin]+ " , " + numbers[end]);
				begin++;
				end--;
			}
			
			if( numbers[begin] + numbers[end] > number )
			{
				end--;
			}
			
			if( numbers[begin] + numbers[end] < number )
			{
				begin++;
			}
		}
	}
}