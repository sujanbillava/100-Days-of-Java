import java.util.*;
import java.util.function.*;

public class Practice 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Entre Name");
            String name=sc.nextLine();
            list.add(name);
        }
        list.forEach(name->System.out.println(name));
        list.forEach(System.out::println);
        for(String name:list)
            {
                Function<String,String>upper=String::toUpperCase;
                System.out.println(upper.apply(name));
            } 
        
    }    
}
