import java.util.*;
import java.util.stream.*;

public class collectortoSet 
{
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<7;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        Set<Integer>result=list.stream()
                                .filter(n->n>10)
                                .map(n->n*2)
                                .collect(Collectors.toSet());
        System.out.println(result);
    }   
}
