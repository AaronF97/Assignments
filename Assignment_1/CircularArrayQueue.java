package Assignment_1;
import javax.swing.JOptionPane;

public class CircularArrayQueue implements Queue 
{
	 protected Object Q[];				// array used to implement the queue 
	 protected int rear = 0;			// index for the rear of the queue
	 protected int front = 0;
	 protected int capacity; 			// The actual capacity of the queue array
	 public static final int CAPACITY = 100;	// default array capacity
	   
	 public CircularArrayQueue() {
		   // default constructor: creates queue with default capacity
		   this(CAPACITY);
	 }

	 public CircularArrayQueue(int cap) {
		  // this constructor allows you to specify capacity
		  capacity = (cap > 0) ? cap : CAPACITY;
		  Q = new Object[capacity]; 
	 }
	 
		 public void enqueue(Object n)
		 {
			 if (isFull()) {
				 System.out.println("Circualr Queue is now full.");//messge will appear to let the user know the queue s full
				 return;
			 }
			 Q[rear] = n;//rear element set to object n
			 rear = (rear+1) % CAPACITY;//a means on looping through the array in a way that appears circular, increments the rear by one every time.
			 
		 }
	 
	 public Object dequeue()
	 {
		 Object element; 
		 if (isEmpty())
			 return null;
		 else
		 {
			 element = Q[front];//front element is always changing in the dequeue each loop initilizes the front elements  to the element object
			 Q[front] = null;
			 front = (front + 1) % CAPACITY;//a means on looping through the array in a way that appears circular, increments the rear by one every time.	 
		 }
		 return element;	
	 }
	
	 public boolean isEmpty()
	 {
		  return (rear == front); //queue is empty when the front and rear pointer are at the same index
	 }
			 
	 
	 public boolean isFull()
	 {	
		 return rear== front-1;//queue is full when the rear is one index behind the front
	 }
	 
	 public Object front()
	 {
		 if (isEmpty())
			 return null;
		 
		 return Q[front];
	 }
}