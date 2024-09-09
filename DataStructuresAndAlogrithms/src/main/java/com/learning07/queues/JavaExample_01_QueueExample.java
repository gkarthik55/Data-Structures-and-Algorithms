package com.learning07.queues;

public class JavaExample_01_QueueExample
{
	public static void main(String[] args) 
	{
		Queue queue = new Queue(5);
		
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(3);
		queue.enqueue(9);
		queue.show();
		
		queue.dequeue();
		queue.show();
	}
}
