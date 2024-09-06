package com.learning02.array;

import java.util.Map;
import java.util.HashMap;

class DSA_12_Arrays_FindDuplicate_Integers_UsingMap
{
	public static void main(String args[])
	{
		int array[] = new int[] {10, 2, 5, 12, 8, 5, 8, 8};
		
		findDuplicates(array);
	}
	
	public static void findDuplicates(int nums[])
	{
		Map<Integer, Integer> elementsCount = new HashMap<>();
		
		for(int num : nums)
		{
			elementsCount.put(num, elementsCount.getOrDefault(num,0)+1);
		}
		
		//Print the Duplicate Elements in the Array
		System.out.println("Duplicate Elements in the Array:");
		for( Map.Entry<Integer, Integer> entry : elementsCount.entrySet() )
		{
			if(entry.getValue() > 1)
			{
				System.out.println(""+ entry.getKey());
			}
		}
	}
}