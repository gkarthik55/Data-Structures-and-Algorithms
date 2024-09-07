package com.learning05.linkedlist;

public class LinkedList 
{
	Node start; //Creating the Start Node
	
	//Insert the Data at the End.
	public void insertAtEnd(int data)
	{
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		
		if(start==null)
		{
			start = node;
		}
		else
		{
			Node travNode = new Node();
			travNode = start;
			
			while(travNode.nextNode != null)
			{
				travNode = travNode.nextNode;
			}
			
			travNode.nextNode = node;
		}
	}

	//Insert the Data at the End.
	public void insertAtBegin(int data) 
	{
		Node newNode = new Node();
		newNode.data = 8; 
		
		if(start != null)
		{
			newNode.nextNode = start;
			start = newNode;
		}
	}
	
	//Insert the Data at the Position.
	public void insertAtPos(int data, int pos) 
	{
		if(pos == 0)
		{
			insertAtBegin(data);
			return;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		Node travNode = new Node();
		travNode = start;
		
		for(int i=0; i<pos-1; i++)
		{
			travNode = travNode.nextNode;
		}
		
		newNode.nextNode = travNode.nextNode;
		travNode.nextNode = newNode;
	}

	//Delete the Data at the Position.
	public void deleteAtPos(int pos) 
	{
		Node travNode = new Node();
		travNode = start;
		
		for(int i=0; i<pos-1; i++)
		{
			travNode = travNode.nextNode;
		}
		
		Node nextNode = travNode.nextNode;
		travNode.nextNode = nextNode.nextNode;
		System.out.println("The deleted data is "+ nextNode.data);
		
		nextNode = null;// Nullify it, So that it is handled by Garbage collector.
	}
	
	//Show all the Data.
	public void show()
	{
		Node travNode = new Node();
		
		if(start != null)
		{
			travNode = start;
			
			while(travNode.nextNode != null)
			{
				System.out.print("["+travNode.data + "] -> ");
				travNode = travNode.nextNode;
			}
			
			System.out.println("["+travNode.data + "] ");
		}
	}
}
