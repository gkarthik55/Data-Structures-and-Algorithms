package com.learning02.array;

class DSA_04_Arrays_PassedInArgs
{
	public static void main(String args[]) 
	{
		//Arrays passed in methods and Sum is calculated.
		
		int numbers[] = new int[]{ 5, 12, 45, 28, 67, 32, 55, 90, 84, 77};
		
		System.out.println("Array elements:");
		for(int num : numbers)
		{
			System.out.print(" "+num);
		}
		
		System.out.println("");
		
		calculateSum(numbers);
	}
	
	public static void calculateSum(int arr[])
	{
		int sum = 0;
		
		for(int i : arr)
		{
			sum = sum + i;
		}
		
		System.out.println("Sum :"+sum);
	}
}