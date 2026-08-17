import java.util.*;

public class arraydequeue 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayDeque<String> deque=new ArrayDeque<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a Coustomer Name=");
            String name=sc.nextLine();
            deque.addLast(name);
        }  
        System.out.println(deque);
        System.out.println(" First Coustomer Name");
        System.out.println(deque.peekFirst());  
        System.out.println(" Last Coustomer Name");
        System.out.println(deque.peekLast());
        deque.removeFirst();
        System.out.println("Check Whether the Coustomer Name Is there or not");
        String cname=sc.nextLine();
        System.out.println(deque.contains(cname));
        System.out.println(deque);
        for(String value:deque)
        {
            System.out.println(value);
        }

    }
}
