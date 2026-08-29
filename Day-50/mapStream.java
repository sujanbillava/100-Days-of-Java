import java.util.*;
import java.util.function.*;
public class mapStream 
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
        list.stream()
            .map(n->n*2)
            .forEach(System.out::println);
        list.stream()
            .filter(n->n%2==0)
            .forEach(System.out::println);
        list.stream()
            .filter(n->n>50)
            .map(n->n*2)
            .forEach(System.out::println);
    }    
}
