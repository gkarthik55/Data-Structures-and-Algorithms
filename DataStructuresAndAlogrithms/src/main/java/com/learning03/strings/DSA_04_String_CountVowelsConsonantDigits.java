package com.learning03.strings;

// Program to count vowels, consonant, digits and special characters in string.
// Ascii values : A-Z = 65-90, a-z= 97-122, 0-9 = 48-57

public class DSA_04_String_CountVowelsConsonantDigits 
{
	public static void main(String[] args) 
	{
		int vowels = 0;
		int consonant = 0;
		int digits = 0; 
		int specialchars = 0;
		
		String str = "Geeks@123";
		
		char charArr[] = str.toLowerCase().toCharArray();
		
		for(int i=0; i<str.length(); i++)
		{
			if(charArr[i] >= 'a' && charArr[i] <= 'z')
			{
				if( charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || 
						charArr[i] == 'o' || charArr[i] == 'u')
				{
					vowels++;
				}
				else
				{
					consonant++;
				}
			}
			else if(charArr[i] >= '0' && charArr[i] <= '9')
			{
				digits++;
			}
			else
			{
				specialchars++;
			}
		}
		
		System.out.println("vowels       :"+vowels);
		System.out.println("consonant    :"+consonant);
		System.out.println("digits       :"+digits);
		System.out.println("specialchars :"+specialchars);
	}
}
