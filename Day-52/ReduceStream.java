import java.util.*;
import java.util.function.*;

public class ReduceStream 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Product Price");
            int price=sc.nextInt();
            list.add(price);
        }    
        System.out.println(list);
        int Total=list.stream()
                       .filter(n->n>500)
                       .map(n->n-(n*10/100))
                       .reduce(0,(a,b)->a+b);
        System.out.println(Total);
    }   
}
