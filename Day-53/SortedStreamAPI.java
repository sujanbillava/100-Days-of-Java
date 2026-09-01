import java.util.*;

public class SortedStreamAPI 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        list.stream()
            .filter(n->n>50)
            .map(n->n*2)
            .sorted((a,b)->b-a)
            .forEach(System.out::println);

    }    
}
