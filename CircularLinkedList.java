public class CircularLinkedList{
	public static void main(String args[])
	{
		CircularLinkedList Obj = new CircularLinkedList();
		Obj.add(11);
		Obj.add(19);
		Obj.add(24);
		Obj.add(14);
		Obj.print();
	}
	public class Node{
		int element;
		Node next;
		public Node(int element){
			this.element=element;
		}
	}
	public Node head =null;
	public Node tail=null;
	
	public void add(int element)
	{
		Node newEle=new Node(element);
		if(head ==null){
			head =newEle;
			tail=newEle;
			newEle.next=head;
		}
		else{
			tail.next =newEle;
			tail=newEle;
			newEle.next =head;
		}
	}
	public void print(){
		Node current =head;
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			System.out.println("Nodes of the circular Linked list: ");
			do{
				System.out.println(" "+ current.element);
				current=current.next;
			}
			while(current !=head);
			System.out.println();
		}
	}
}