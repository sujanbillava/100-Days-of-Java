import java.io.*;
import java.util.*;
public class stackpractice
{
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.println("Push 5 element in stack");
        for(int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            stack.push(num);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("Peek Element="+stack.peek());
        System.out.println(stack.search(20));
    }   
}
