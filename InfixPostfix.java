import java.util.Stack;
public class InfixPostfix {
    public static boolean isOperator(char op)
    {
        if(op == '+' || op == '-' || op == '*' || op== '/' || op =='%')
        return true;
        return false;
    }
    
    public static int precedence(char op)
    {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;   
            case '%':
                return 3;
            default :
                return 4;
        }
    }
    public static boolean isLowerPrecedence(char op1, char op2)
    {
        if(precedence (op1) < precedence(op2))
            return true;
        return false;
    }
    public static String convertIntToPostfix(String infix)
    {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<infix.length();i++)
        {
            char currentCharacter = infix.charAt(i);
            if(!isOperator(currentCharacter)){
                sb.append(currentCharacter);
            }
            else{
                if(stack.empty()) stack.push(currentCharacter);
                else{
                    while(!stack.empty() && isLowerPrecedennce(currentCharacter, stack.peek()))
                    sb.append(stack.pop());
                }
                stack.push(currentCharacter);
            }
        }
    }
    while(!stack.empty()) sb.append(stack.pop());

    return sb.toString();
}
public static void main(String args[])
{
    System.out.println(convertInixToPostfix("4*5+6/7"));
}
}