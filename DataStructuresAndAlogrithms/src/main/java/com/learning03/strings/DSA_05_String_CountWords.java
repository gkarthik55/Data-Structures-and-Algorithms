package com.learning03.strings;

// Program to count the words in the given string.
public class DSA_05_String_CountWords 
{
	public static void main(String[] args) 
	{
		String str = "This is my country India";
		
		countWords(str);
	}
	
	public static void countWords(String str)
	{
		String stringArr[] = str.split(" ");
		
		System.out.println("No of words in the given String: "+ stringArr.length);
	}
}
