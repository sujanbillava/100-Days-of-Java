import java.io.*;
import java.util.*;
public class stackapplication
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Parentheses");
        String para=sc.nextLine();
        boolean balanced=true;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<para.length();i++)
        {
            char ch=para.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                stack.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}')
            {
                if(stack.empty())
                {
                    balanced =false;
                    break;
                }
                else if(ch==')'&&stack.peek()=='(')
                {
                    stack.pop();
                }
                else if(ch==']'&&stack.peek()=='[')
                {
                    stack.pop();
                }
                else if(ch=='}'&&stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    balanced=false;
                    break;
                }
                
            }
        }
        if(!stack.empty())
        {
            balanced =false;
        }
        if(balanced)
        {
            System.out.println("Balanced Stack");
        }
        else{
            System.out.println("Unbalanced Stack");
        }
    }
}