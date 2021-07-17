import java.util.*;
class PriorityQ{
	public static void main(String args[])
	{
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("hey");
		pq.add("its");
		pq.add("Jaydeep");
		System.out.println("Priority Queue is: "+pq);
		
		String value =pq.peek();
		System.out.println("Element accessed is: "+ value);
	}
}