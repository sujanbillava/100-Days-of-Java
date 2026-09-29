import java.io.*;
import java.util.*;
public class ExpressionConversion 
{
    static int precedence(char ch)
    {
        if(ch == '+' || ch == '-')
            return 1;
        if(ch == '*' || ch == '/')
            return 2;
        return 0;
    }

    static String infixToPostfix(String exp)
    {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                result += ch;
            }
            else if(ch == '(')
            {
                stack.push(ch);
            }
            else if(ch == ')')
            {
                while(!stack.empty() && stack.peek() != '(')
                {
                    result += stack.pop();
                }
                stack.pop();
            }
            else
            {
                while(!stack.empty() &&
                      precedence(stack.peek()) >= precedence(ch))
                {
                    result += stack.pop();
                }

                stack.push(ch);
            }
        }

        while(!stack.empty())
        {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Infix Expression:");
        String expression = sc.nextLine();

        String postfix = infixToPostfix(expression);

        System.out.println("Postfix = " + postfix);
    }
}

