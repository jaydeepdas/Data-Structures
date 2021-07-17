import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ{
	static Queue<Integer> que;
	
	static void show()
	{
		while(!que.isEmpty()){
			System.out.print(que.peek()+ ", ");
			que.remove();
		}
	}
	static void queuereverse()
	{
		Stack<Integer> stk = new Stack<>();
		while(!que.isEmpty()){
			stk.add(que.peek());
			que.remove();
		}
		while(!stk.isEmpty()){
			que.add(stk.peek());
			stk.pop();
		}
	}
	public static void main(String args[])
	{
		que = new LinkedList<Integer>();
		que.add(5);
		que.add(15);
		que.add(51);
		que.add(55);
		que.add(45);
		queuereverse();
		show();
	}
	
}