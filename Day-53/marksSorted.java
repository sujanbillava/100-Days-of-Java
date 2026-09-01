import java.util.*;

public class marksSorted 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter Student mark");
            int mark=sc.nextInt();
            list.add(mark);
        }
        System.out.println(list);
        list.stream()
            .filter(n->n>=40)
            .map(n->n+5)
            .sorted((a,b)->b-a)
            .forEach(System.out::println);
    }    
}
