package com.learning02.array;

import java.util.ArrayList;
import java.util.List;

class DSA_06_Arrays_AndArrayList
{
	public static void main(String args[]) 
	{
		int arr[] = new int[] {12, 3, 45, 25, 10};
		
		System.out.println("Array elements : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		
		//Example of ArrayList
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		//Default size of ArrayList
		System.out.println(arrList.size());
		
		//Add method of Arraylist
		arrList.add(5);
		arrList.add(23);
		arrList.add(10);
		arrList.add(8);
		
		//Print the Arraylist 
		System.out.println(arrList.toString());
		
		//Now check the size of ArrayList
		System.out.println(arrList.size());
		
		//Remove method of Arraylist
		arrList.remove(1);
		arrList.remove(2);
		
		//Print the Arraylist 
		System.out.println(arrList.toString());
		
		System.out.println("Check if it contains the value 5");
		System.out.println(arrList.contains(5));

		System.out.println("Check if it contains the value 8");
		System.out.println(arrList.contains(8));
		
	}
}