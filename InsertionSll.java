import java.util.*;
public class InsertionSll {
    public static void main(String args[]) 
    throws Exception{
        LinkedList l1= new LinkedList();
        l1.addLast(60);
        l1.addLast(30);
        l1.addLast(80);
        l1.addLast(10);
        l1.addLast(450);
        l1.display();
    }
}
class LinkedList{
    private class Node{
        int data;
        Node next;

        public Node(int data,Node next){
        this.data= data;
        this.next =next;
    }
}
private Node head;
private Node tail;
private int size;

public LinkedList()
{
    this.head =null;
    this.tail =null;
    this.size=0;
}
public int size(){
    return this.size; //function to find the size
}

public void display(){
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data+ "->"); //Traverse
        temp=temp.next;
    }
    System.out.println("End");
}

public void addLast(int item)
{
    Node temp =new Node(item,null);
    if(this.size() == 0)
    {
        this.head =this.tail =temp;
    }
    else{
        this.tail.next=temp;
        this.tail = temp;
    }
    this.size++;
}
}


