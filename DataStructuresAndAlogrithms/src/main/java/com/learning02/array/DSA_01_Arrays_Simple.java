package com.learning02.array;

import java.util.Scanner;

class DSA_01_Arrays_Simple
{
	public static void main(String args[]) 
	{
		// Declares an Array of integers, allocating memory for 5 integers. 
	    // Accessing the elements of the specified array using index.

		int size = 5; 
		int arr[] = new int[size];
		
		System.out.println("Enter the 5 intergers for an Array");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements");
		
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}