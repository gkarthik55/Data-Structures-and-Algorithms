package com.learning03.strings;

public class DSA_11_String_ReverseEachStringInSentence
{
	public static void main(String[] args)
	{
		String str = "Today is a Nice Day";
		String strArr[] = str.split("\\s");
		
		for(String s: strArr)
		{
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			
			System.out.println(sb);
		}
	}
}
