package com.learning03.strings;

// Program to check if a given string is a palindrome or not.
public class DSA_09_String_Palindrome
{
	public static void main(String[] args)
	{
		String str = "madam";
		boolean isPalindrome = checkIfPalindrome(str);
		
		if(isPalindrome)
		{
			System.out.println("The given string is a Palindrome.");
		}
		else
		{
			System.out.println("The given string is not a Palindrome.");
		}
	}
	
	public static boolean checkIfPalindrome(String str)
	{
		char charArr[] = str.toCharArray();
		
		int begin = 0;
		int end = str.length()-1;
		
		while(begin < end)
		{
			if(charArr[begin] != charArr[end])
			{
				return false;
			}
			else
			{
				begin++; end--;
			}
		}
		
		return true;
	}
}
