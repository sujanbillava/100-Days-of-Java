import java.util.*;
import java.util.stream.*;

public class Revision4 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }    
        System.out.println(list);
        List<Integer>result=list.stream()
                                .distinct()
                                .filter(n->n%2==0)
                                .filter(n->n>10)
                                .sorted()
                                .collect(Collectors.toList());
        System.out.println(result);
    }    
}
