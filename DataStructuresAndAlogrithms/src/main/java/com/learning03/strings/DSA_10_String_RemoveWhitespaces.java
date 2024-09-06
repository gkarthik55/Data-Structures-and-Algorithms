package com.learning03.strings;

public class DSA_10_String_RemoveWhitespaces
{
	public static void main(String[] args)
	{
		//Extract the Words from the given Sentence and Print the Words. 
		String str1 = "This is a nice day";
		
		String strArr[] = str1.split("\\s");
		
		for(String str: strArr)
		{
			System.out.println(str);
		}
	}
}
