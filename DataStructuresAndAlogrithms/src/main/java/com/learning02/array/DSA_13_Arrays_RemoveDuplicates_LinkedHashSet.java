package com.learning02.array;

import java.util.LinkedHashSet;
import java.util.Set;

class DSA_13_Arrays_RemoveDuplicates_LinkedHashSet
{
	public static void main(String args[]) 
	{
		//Remove the Duplicate Elements from Array.
		int nums[] = new int[]{ 5, 12, 5, 28, 12, 32, 5, 8, 25, 8};
		
		System.out.println("Array elements:");
		for(int num : nums)
		{
			System.out.print(" "+num);
		}
		
		System.out.println();
		removeDuplicate(nums);
	}
	
	public static void removeDuplicate(int arr[])
	{
		Set<Integer> nums = new LinkedHashSet<Integer>();
				
		for(int i=0 ; i<arr.length; i++)
		{
			nums.add(arr[i]);
		}
		
		System.out.println("Removed Dupicate Array elements:");	
		System.out.println(nums.toString());
	}
}