package com.learning02.array;

import java.util.Scanner;

class DSA_03_Arrays_MultiDimension
{
	public static void main(String args[]) 
	{
		// Declares an Multi Dimensional Array. 

		int size = 3; 
		int arr[][] = new int[size][size];
		
		System.out.println("Enter the 3*3 intergers for an Array");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++)
		{
			for(int j=0; j<size; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Multi-Dimensional Array elements");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(" "+ arr[i][j]);
			}
			System.out.println();
		}
	}
}