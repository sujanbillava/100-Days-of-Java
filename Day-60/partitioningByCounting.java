import java.util.*;
import java.util.stream.*;
public class partitioningByCounting 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<7;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            list.add(name);
        }
        System.out.println(list);
        Map<Boolean,Long>result=list.stream()
                                    .collect(Collectors.partitioningBy(name->name.length()>=5,Collectors.counting()));
        System.out.println(result);
    }    
}
