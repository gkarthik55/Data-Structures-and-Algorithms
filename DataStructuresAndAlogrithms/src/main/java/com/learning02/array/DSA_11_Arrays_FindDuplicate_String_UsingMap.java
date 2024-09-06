package com.learning02.array;

import java.util.HashMap;
import java.util.Map;

class DSA_11_Arrays_FindDuplicate_String_UsingMap
{
	public static void main(String args[])
	{
		// Find the Duplicate Name in an Array.
		String subjects[] = new String[] {"C++", "Java", "Java", "Python", "C#", "C++", "Javascripts"};

		// Approach 1 - Use the HashMap 
		Map<String, Integer> subjectsAndCount = new HashMap<>();
		
		//HashMap takes	O(n) time
		for(String subject : subjects)
		{
			if(subjectsAndCount.get(subject) == null)
			{
				subjectsAndCount.put(subject, 1);
			}
			else
			{
				Integer count = subjectsAndCount.get(subject);
				subjectsAndCount.put(subject, ++count);
			}
		}
		
		System.out.println("Map :"+subjectsAndCount.toString());

		System.out.println("Duplicate Elements list:");
	 	for(Map.Entry<String, Integer> mapEntry : subjectsAndCount.entrySet())
	 	{
	 		if(mapEntry.getValue() > 1)
	 		{
	 			System.out.println(" "+mapEntry.getKey());
	 		}
	 	}
		
		System.out.println();
	}
	
	
}