public class StackRepr {
    public static void main(String args[])
    {
        Stack stk= new Stack();
        stk.push(20);
        stk.push(40);
        stk.push(60);
        System.out.println(stk.pop());
    }
    
}
class Stack{
    static int MAX =100;
    int top;
    int a[]= new int[MAX];

    boolean isEmpty()
    {
        return(top<0);
    }
    Stack()
    {
        top=-1;
    }
    boolean push(int x)
    {
        if(top >= (MAX -1)){
            System.out.println("Overflow condition reached");
            return false;
        }
        else{
            a[++top] =x;
            System.out.println(x+ "pushed into stack");
        }
    }
    int pop()
    {
        if(top < 0){
            System.out.println("Underflow ondition reached");
            return 0;
        }
        else{
            int x=a[top - ];
            return x;
        }
    }
    int peek()
    {
        if(top<0){
            System.out.println("Underflow condition");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
    }
}
