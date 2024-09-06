package com.learning03.strings;

public class DSA_14_String_ReverseStringUsingRecursion
{
	public static void main(String[] args)
	{
		String str = "karthik";
		char charArr[] = str.toCharArray();
		
		reverseString(charArr, 0, str.length()-1);
		
		System.out.println("Reversed String :"+ String.valueOf(charArr));
	}
	
	public static void reverseString(char charArr[], int begin, int end)
	{
		if(begin >= end)
			return;
		
		char temp = charArr[begin];
		charArr[begin] = charArr[end];
		charArr[end] = temp;
		
		begin = begin + 1;
		end = end - 1;
		
		reverseString(charArr, begin, end);
	}
}
