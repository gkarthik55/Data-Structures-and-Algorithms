package com.learning02.array;

class DSA_07_Arrays_FindDuplicate_Brute
{
	public static void main(String args[])
	{
		// Find Duplicate Elements in an Unsorted Array.
		int arr[] = new int[] {10, 4, 8, 5, 4, 8, 8, 12};
		
		// Approach 1 - Brute Force Method
		// Time complexity is O(n*n)
		
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate Element :"+ arr[i]);
					break;
				}
			}
		}
	}
}