package com.learning03.strings;

import java.util.HashSet;
import java.util.Set;

// Find the duplicate characters from a string. Using Hashset data structure.
public class DSA_07_String_DuplicateCharacters_Hashset 
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
		
		Set<Character> charSet = new HashSet<Character>();
		
		for(int i=0; i<len; i++)
		{
			char character = charArr[i];
			
			if(charSet.add(character)==false)
			{
				System.out.println("Duplicate Character :"+character);
			}
		}
	}
}
