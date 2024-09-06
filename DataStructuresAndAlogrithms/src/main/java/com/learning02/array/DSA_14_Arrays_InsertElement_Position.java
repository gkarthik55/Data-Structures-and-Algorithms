package com.learning02.array;

import java.util.Arrays;

// How to Insert an item into an array at a specific index java? Good Approach
// Time complexity is O(n)
class DSA_14_Arrays_InsertElement_Position
{
	public static void main(String args[]) 
	{
		int elements[] = new int[] {12, 5, 8, 20, 35};
		
		insertElementAtPos(100, 5, elements);
	}
	
	public static void insertElementAtPos(int element, int position, int array[])
	{
		if(position<0 || position > array.length)
		{
			System.out.println("Invalid Position. Provide the value btw Array limit");
		}
		else
		{
			int size = array.length;
			int newArray[] = new int[size+1];
			
			//First we need to traverse till the position.
			for(int i=0; i<position; i++)
			{
				newArray[i] = array[i];
			}
			
			//Add the element to the position.
			newArray[position] = element;
			
			//Now add the remaining elements.
			for(int j=position+1; j<newArray.length; j++ )
			{
				newArray[j] = array[j-1];
			}
			
			System.out.println(Arrays.toString(newArray));
		}
	}
}