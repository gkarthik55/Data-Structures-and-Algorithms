package com.learning02.array;

class DSA_05_Arrays_FinalArray
{
	public static void main(String args[]) 
	{
		//Example of Final Array 
		
		final int arr[] = new int[] {12,5,25,33,45};
		
		// The array arr is declared as final, but the elements of array are changed  
		// without any problem. 
		arr[2] = 20;
		
		System.out.println("Array elements:");
		for(int elem : arr)
		{
			System.out.print(" "+elem);
		}
		
		System.out.println("");
		
		// Arrays are objects and object variables are always references in Java. 
		
		// So, when we declare an object variable as final, it means that the variable 
		// cannot be changed to refer to anything else. 		
			
		int newArr[] = new int[] {5, 12, 45, 28, 67};
		
		//arr = newArr;
		// Error: The final local variable arr cannot be assigned.
	}
}