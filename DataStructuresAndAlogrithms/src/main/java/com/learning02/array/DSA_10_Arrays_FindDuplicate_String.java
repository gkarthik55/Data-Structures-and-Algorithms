package com.learning02.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class DSA_10_Arrays_FindDuplicate_String
{
	public static void main(String args[])
	{
		// Find the Duplicate Names in an Array.
		String subjects[] = new String[] {"C++", "Java", "Java", "Python", "C#", "C++", "Javascripts"};

		System.out.println("Array Elements:");
		for(String sub : subjects)
		{
			System.out.println(" "+ sub);
		}
		
		Arrays.sort(subjects);
		
		// Approach 1
		System.out.println("Duplicate Element using Approach 1:");
		for(int i=0 ; i<subjects.length-1 ; i++)
		{
			if (subjects[i].equals(subjects[i+1]))
			{
				System.out.println(" "+subjects[i]);
			}
		}
		
		// Time Complexity:
		// Sorting the array: O(n logn) : Quick Sort
		// Iterating through the array: O(n)
		
		// Approach 2
		Set<String> uniqueSet = new HashSet<String>();
		Set<String> duplicateSet = new HashSet<String>();
		
		//Execute the Logic to calculate both duplicateSet and uniqueSet.
		for(String subject : subjects)
		{
			if(uniqueSet.add(subject) == false)
			{
				duplicateSet.add(subject);
			}
		}
		
		System.out.println("Duplicate Element using Approach 2:");
		for(String name : duplicateSet)
		{
			System.out.print(" "+name);
		}
		
		System.out.println();
		
		System.out.println("Unique Element List:");
		for(String name : uniqueSet)
		{
			System.out.print(" "+name);
		}
		
		// Space Complexity Analysis:
		// Unique Elements Set : O(n) and Duplicate Elements Set : O(n/2)
		
		System.out.println();
	}
}