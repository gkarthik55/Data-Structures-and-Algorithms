package com.learning02.array;

import java.util.Arrays;

class DSA_09_Arrays_FindDuplicate_Names
{
	public static void main(String args[])
	{
		// Find the Duplicate Name in an Array.
		
		String subjects[] = new String[] {"C++", "Java", "Java", "Python", "C#", "C++", "Javascripts"};
		
		System.out.println("Array Elements:");
		for(String sub : subjects)
		{
			System.out.println(" "+ sub);
		}

		Arrays.sort(subjects);
		
		for(int i=0 ; i<subjects.length-1 ; i++)
		{
			if (subjects[i].equals(subjects[i+1]))
			{
				System.out.println("Duplicate Element is "+ subjects[i]);
			}
		}
	}
}