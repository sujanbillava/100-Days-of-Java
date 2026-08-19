import java.util.*;
public class priorityqueue
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Patient Prioity");
            int prior=sc.nextInt();
            queue.add(prior);
        }
        System.out.println(queue);
        System.out.println("Display Highest Priority Patient");
        System.out.println(queue.peek());
        queue.poll();
        System.out.print("After the Removal of highest Priority");
        System.out.println(queue);
        System.out.println("Search any one Priority that contains or not");
        int search=sc.nextInt();
        System.out.println(queue.contains(search));
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}