package com.learning03.strings;

public class DSA_13_String_ReverseString
{
	public static void main(String[] args)
	{
		String str = "Geeks";
		String revStr = reverseString(str);
		
		System.out.println("Reversed String :"+ revStr);
	}
	
	public static String reverseString(String str)
	{
		char charArr[] = str.toCharArray();
		
		int begin = 0;
		int end = str.length()-1;
		
		while(begin < end)
		{
			char temp = charArr[begin];
			charArr[begin] = charArr[end];
			charArr[end] = temp;
			
			begin++;
			end--;
		}
		
		return String.valueOf(charArr);
	}
}
