import java.util.*;
import java.util.function.*;

public class StreamAPI 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }
        list.stream()
            .forEach(System.out::println);
        list.stream()
            .filter(e->e%2==0)
            .forEach(System.out::println);
        list.stream()
            .filter(n-> n>50)
            .forEach(System.out::println);
            
    }    
}
