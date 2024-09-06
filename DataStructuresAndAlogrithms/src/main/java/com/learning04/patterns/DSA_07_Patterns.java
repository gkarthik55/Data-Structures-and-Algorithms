package com.learning04.patterns;

public class DSA_07_Patterns 
{
	public static void main(String[] args) 
	{
		int rows = 5;
		int columns = 9;
		
		int pos = 5;
		int num = 1;
		
		String value = "*";
		
		for(int i=1; i<= rows; i++) //Outer Loop
		{
			for(int j=1; j<= columns; j++) //Inner Loop
			{
				System.out.print("  ");
				
				if(j == pos)
				{
					for(int k=1; k<=num; k++)
					{
						System.out.print(value+" ");
					}
					num = num+2;
					break;
				}
			}
			pos = pos - 1;
			System.out.println();
		}
	}
}
