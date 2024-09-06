package com.learning03.strings;

// Find the duplicate characters from a string. Brute Force. 
public class DSA_06_String_DuplicateCharacters 
{
	public static void main(String[] args) 
	{
		String str = "Geeks";
		
		findDuplicateCharacters(str);
	}
	
	public static void findDuplicateCharacters(String str)
	{
		int len = str.length();
		char charArr[] = str.toCharArray();
		
		for(int i=0; i<len; i++)
		{
			char character = charArr[i];
			
			for(int j=0; j<len; j++)
			{
				if(i!=j && character==charArr[j])
				{
					System.out.println("Duplicate Character :"+character);
				}
			}
		}
	}
}
