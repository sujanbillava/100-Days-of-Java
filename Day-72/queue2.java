import java.io.*;
import java.util.*;
public class queue2 
{
    public static void main(String[] args) 
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.offer(30);
        System.out.println(q.element());
        System.out.println(q.peek());
        q.remove();
        q.poll();
        System.out.println("After Every Operation, Answer="+q);    
    }    
}
