package Assignment_1;

import javax.swing.JOptionPane;


public class CircularArrayTest {
	public static void main(String[] args) {
		// Create a Queue
		Queue q = new CircularArrayQueue(0); 
		
		
		System.out.println("queue full?: "+q.isFull());
		
		// Put some strings onto the queue
		System.out.println( "About to enqueue words: \nThe end is nigh!");
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");

		// Now dequeue them from the queue
		System.out.println("About to dequeue the words: \nThe end is nigh!");
		System.out.println("Front element: "+q.front());
		while( !q.isEmpty())
		{
			q.dequeue(); 
			System.out.println("\n The element, " +q.front()+ ", has been dequeued");//prints the elements as they are dequeued
			
		}
		
		//test to see what would happen if there isnt enough pace in the array
		/*
		q = new CircularArrayQueue(2);
		System.out.println( "About to enqueue words: \nThe end is nigh!");
		q.enqueue("The");
		q.enqueue("end");
		q.enqueue("is");
		q.enqueue("nigh!");
		
		System.out.println("About to dequeue the words: \nThe end is nigh!");
		System.out.println("Front element: "+q.front());
		while( !q.isEmpty())
		{
			q.dequeue(); 
			System.out.println("\n The element, " +q.front()+ ", has been dequeued");//prints the elements as they are dequeued
			
		}
		*/
		
		System.exit(0);
	}

}
		