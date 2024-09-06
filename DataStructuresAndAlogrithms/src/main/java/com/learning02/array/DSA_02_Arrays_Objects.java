package com.learning02.array;

class DSA_02_Arrays_Objects
{
	public static void main(String args[]) 
	{
		Person p1 = new Person(10, "Karthik", "Bangalore");
		Person p2 = new Person(20, "Srikanth", "Tumkur");
		Person p3 = new Person(10, "Raghu", "Mandya");

		// Array of Custom objects.
		Person pArr[] = new Person[] {p1, p2, p3};
		
		System.out.println("Custom objects Array elements:");
		
		for(int i=0; i<pArr.length; i++)
		{
			System.out.println(" "+pArr[i].toString());
		}
	}
}