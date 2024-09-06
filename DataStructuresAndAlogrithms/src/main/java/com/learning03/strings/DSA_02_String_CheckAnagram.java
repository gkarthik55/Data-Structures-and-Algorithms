package com.learning03.strings;

import java.util.Arrays;

// Program to check whether two strings are anagram or not?
// Two strings are called anagrams if they contain same set of characters but in different order.
//"keep ? peek"

public class DSA_02_String_CheckAnagram 
{
	public static void main(String[] args) 
	{
		String str1 = "keep";
		String str2 = "peek";
		
		checkIfAnagram(str1, str2);
	}
	
	public static void checkIfAnagram(String str1, String str2)
	{
		boolean isAnagram = true;
		
		if(str1.length() != str2.length())
		{
			System.out.println("It's not an Anagram");
		}
		else
		{
			int len = str1.length();
			
			char charArr1[] = str1.toCharArray();
			char charArr2[] = str2.toCharArray();
		
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			
			for(int i=0; i<len; i++)
			{
				if(charArr1[i] != charArr2[i])
				{
					isAnagram = false;
					break;
				}
			}
			
			if(isAnagram == false)
			{
				System.out.println("It's not an Anagram");
			}
			else
			{
				System.out.println("It's an Anagram");
			}
		}
	}
}
