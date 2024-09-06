package com.learning02.array;

import java.util.HashMap;
import java.util.Map;

// Find all pairs of an integer array whose sum is equal to a given number using HashMap.
// Time complexity is O(n)

class DSA_18_Arrays_FindPairs_Integer_Hashmap
{
	public static void main(String args[]) 
	{
		int array[] = {1, 5, 2, 4};
		
		findPairs(array, 6);
	}
	
	public static void findPairs(int numbers[], int sum)
	{
		Map<Integer, Integer> elementCount = new HashMap<>();
		
		for(int number : numbers)
		{
			int complement = sum - number;
			
			if(elementCount.containsKey(complement))
			{
				System.out.println("Pair :"+ complement +" , "+number);
			}
			else
			{
				elementCount.put(number, elementCount.getOrDefault(number,0)+1);
			}
		}
	}
}