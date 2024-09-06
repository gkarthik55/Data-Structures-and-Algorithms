package com.learning02.array;

import java.util.Arrays;
import java.util.List;

public class DSA_06_Arrays_AsList 
{
	public static void main(String[] args) 
	{
		String subjects[] = new String[] {"C++", "Java", "DS", "Python", "DBMS"};
		
		System.out.println("Subject Names:");
		for(String subject: subjects)
		{
			System.out.println(subject);
		}
		System.out.println("------------------------------------------------------------");
		
		//Convert Array to List. We have a feature in Array class.
		List<String> subjectsList = Arrays.asList(subjects);
		
		System.out.println("Converted Array to List. We have a feature in Arrays class.");
		System.out.println(subjectsList.toString());
	}
}
