package com.learning03.strings;

import java.util.HashMap;
import java.util.Map;

// Program to count the no of occurrences of each character in the given string. 
public class DSA_08_String_CountCharacterOccurances_HashMap 
{
	public static void main(String[] args) 
	{
		String str = "character";
		printCharacterOccurancesCount(str);
	}
	
	public static void printCharacterOccurancesCount(String str)
	{
		int len = str.length();
		char charArr[] = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		// Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		// If you need to manage the character sequence then use LinkedHashMap.
		
		for(int i=0; i<len; i++)
		{
			char character = charArr[i];
			
			if(charMap.containsKey(character))
			{
				int count = charMap.get(character);
				charMap.put(character, ++count);
			}
			else
			{
				charMap.put(character, 1);
			}
		}
		
		for(Map.Entry<Character,Integer> entry : charMap.entrySet())
		{
			System.out.println(" Character Element :"+entry.getKey()+" Occurance:"+entry.getValue());
		}
	}
}
