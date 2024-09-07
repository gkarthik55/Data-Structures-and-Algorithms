package com.learning05.linkedlist;

public class JavaExample_01_LinkedListExample
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.insertAtEnd(12);
		list.insertAtEnd(5);
		list.insertAtBegin(8);
		list.insertAtPos(17, 2);
		list.show();
		
		list.deleteAtPos(2);
		list.show();
	}
}
