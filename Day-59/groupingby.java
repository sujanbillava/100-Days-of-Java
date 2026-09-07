import java.util.*;
import java.util.stream.*;

public class groupingby 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            list.add(name);
        }    
        System.out.println(list);
        Map<Character,List<String>>result=list.stream()
                                               .collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(result);                             
    }    
}
