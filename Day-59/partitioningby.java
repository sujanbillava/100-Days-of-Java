import java.util.*;
import java.util.stream.*;

public class partitioningby 
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
        Map<Boolean,List<Integer>>result=list.stream()
                                              .collect(Collectors.partitioningBy(n->n>50));
        System.out.println(result);
    }
}    
