package com.learning02.array;

import java.util.Arrays;

class DSA_0_Arrays_FindDuplicate_Tuned
{
	public static void main(String args[])
	{
		// Find Duplicate Elements in an Unsorted Array.
		int arr[] = new int[] {10, 4, 8, 5, 4, 8, 8, 8, 8, 12 , 4, 4};
		
		// Approach 2 - Sort and Compare Previous and Next Element except first one.
		
		// Time Complexity: Sorting the array: O(n logn), Iterating through the array: O(n)
		
		//Using Arrays.sort method.
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				//Compare previous and next element expect first
				if(i == 0 || arr[i-1] != arr[i+1] )
				{
					System.out.println("Duplicate Element :"+arr[i]);
				}
			}
		}
	}
}