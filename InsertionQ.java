//INSERTION & DELETION

import java.util.Scanner;

public class InsertionQ {
	
	public final static int MAX = 50;

	public static int[] queue = new int[MAX];

	public static int front = -1, rear = -1;

	public static void enqueue(int data) 
	{
		if(rear == MAX - 1) {
			System.out.print("\nQueue is Full!");
		} else {
			rear = rear + 1;
			queue[rear] = data;
			if(front == -1) 
			{
				front = 0;
			}
		}
	}

	public static void disp()  {
	    
		System.out.print("\nThe elements in the queue are:");
		if(front == -1) {
			System.out.print("\nQueue is Empty");
		} 
                else {
			for(int i = front; i <= rear; i++) {
				System.out.print(queue[i] + "  ");
			}
		}
		System.out.println();
	}
	//function to delete elements from the queue
	public static void dequeue(){
		if(front ==-1 || front == rear+1){
			System.out.print("\n Queue is Empty");
		}
		else{
			queue[front] = 0;
			front = front+1;
		}
		disp();
	} 
	
	public static void main(String[] args)  
	{
		int data, size;
		System.out.print("Enter the size of queue: ");
		size = STDIN_SCANNER.nextInt();
		for(int i = 0; i < size; i++) 
		{
			System.out.println("\nEnter Data to Enqueue:");
			data = STDIN_SCANNER.nextInt();
			
			enqueue(data);
			
		}
		disp();
		System.out.println("\nDequeuing: ");{
			dequeue();
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}