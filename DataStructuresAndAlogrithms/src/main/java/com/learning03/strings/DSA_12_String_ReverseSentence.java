package com.learning03.strings;

public class DSA_12_String_ReverseSentence
{
	public static void main(String[] args)
	{
		String str = "Today is a Nice Day";
		String strArr[] = str.split("\\s");
		
		int len = strArr.length-1;
		
		while(len>=0)
		{
			System.out.println(strArr[len]);
			len--;
		}
	}
}
