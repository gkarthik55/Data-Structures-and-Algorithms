package com.learning07.queues;

public class Queue 
{
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    // Constructor to initialize the queue with a given capacity
    public Queue(int capacity) 
    {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
	
    // Method to add an element to the queue
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("\nQueue is Full. Cannot enqueue.");
		}
		else
		{
			queue[rear] = data;
			rear = (rear + 1) % capacity; // Wrap around using modulo.
			size = size + 1;
			System.out.println("Enqueued: " + data);
		}
	}

    // Method to remove an element from the queue
	public void dequeue() 
	{
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty. Cannot dequeue.");
		}
		else
		{
			int element = queue[front];
			queue[front] = 0;
			front = (front + 1) % capacity; // Wrap around using modulo
			size = size - 1;
			
			System.out.println("\nElement "+element+" is dequeued.");
		}
	}

	public void show() 
	{
		System.out.println("\nQueue Elements:");
		
		if (isEmpty()) 
        {
            System.out.println("Queue is empty.");
            return;
        }
		
		for(int i=0; i<size; i++)
		{
			System.out.print("["+queue[(front+i) % capacity]+"] ");
		}
	}
	
	public int getSize() 
	{
		return size;
	}
	
	public boolean isFull()
	{
		if(size == capacity)
		{
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() 
	{
		if(size == 0)
		{
			return true;
		}
		
		return false;
	}
}
