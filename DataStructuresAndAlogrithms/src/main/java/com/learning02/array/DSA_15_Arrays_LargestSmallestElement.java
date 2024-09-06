package com.learning02.array;

// Find the Largest and SecondLargest Element in the Array
// Time complexity of this solution is O(n).
class DSA_15_Arrays_LargestSmallestElement
{
	public static void main(String args[]) 
	{
		int numbers[] = new int[] {12,3,5,11};
		
		findLargestAndSecondLargestElement(numbers);
	}
	
	public static void findLargestAndSecondLargestElement(int array[])
	{
		int largest = 0;
		int secondLargest = 0;
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]> largest)
			{
				secondLargest = largest;
				largest = array[i];
			}
			
			if( array[i]>secondLargest && array[i]<largest )
			{
				secondLargest = array[i];
			}
		}
		
		System.out.println("Largest Element :"+ largest);
		System.out.println("Second Largest Element :"+ secondLargest);
	}
}