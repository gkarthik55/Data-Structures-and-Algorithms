package com.learning04.patterns;

public class DSA_03_Patterns 
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int columns = 1;
		
		for(int i=1; i<= rows; i++) // Outer Loop
		{
			for(int j=1; j<= columns; j++)//Inner Loop
			{
				System.out.print(j+" ");
			}
			
			columns = columns + 1;
			System.out.println();
		}
	}
}
