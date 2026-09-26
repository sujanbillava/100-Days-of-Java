import java.io.*;
import java.util.*;
public class dequeuee
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Deque<Integer> dq=new ArrayDeque<>();
        System.out.println("Add 3 element in last");
        for(int i=0;i<3;i++)
            {
                int last=sc.nextInt();
                dq.addLast(last);
            }  
        System.out.println("Add 2 element in first");
        for(int i=0;i<2;i++)
            {
                int first=sc.nextInt();
                dq.addFirst(first);
            } 
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
    }
}
