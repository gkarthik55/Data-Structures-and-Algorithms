package com.learning02.array;

// Find the Largest and Smallest Element in the Array
// Time complexity of this solution is O(n).

class DSA_16_Arrays_LargestSecondLargestElement
{
	public static void main(String args[]) 
	{
		int numbers[] = new int[] {55, 32, 5, 98, 82, 25, 19, 8, 12};
		
		findLargestAndSmallestElement(numbers);
	}
	
	public static void findLargestAndSmallestElement(int array[])
	{
		int largest = array[0];
		int smallest = array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
			
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
		}
		
		System.out.println("Largest Element :"+ largest);
		System.out.println("Smallest Element :"+ smallest);
	}
}