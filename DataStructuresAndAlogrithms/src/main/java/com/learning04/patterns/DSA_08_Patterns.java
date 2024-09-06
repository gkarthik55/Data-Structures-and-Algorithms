package com.learning04.patterns;

public class DSA_08_Patterns 
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int columns = 9;
		
		int pos = 1;
		int num = 9;
		
		String value = "*";
		
		for(int i=1; i<= rows; i++) //Outer Loop
		{
			for(int j=1; j<= columns; j++) //Inner Loop
			{
				if(j==pos)
				{
					for(int k=j; k<=num; k++)
					{
						System.out.print(value+" ");
					}
					num = num - 1;
				}
				else
				{
					System.out.print("  ");
				}
			}
			pos = pos + 1;
			
			System.out.println();
		}
	}
}
