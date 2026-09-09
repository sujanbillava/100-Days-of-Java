import java.util.*;
import java.util.stream.*;

public class Revision3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }    
        System.out.println(list);
        Map<Integer,Long>result=list.stream()
                                    .collect(Collectors.groupingBy(n->n/10,Collectors.counting()));
        System.out.println(result);
    }    
}
