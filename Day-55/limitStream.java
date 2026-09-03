import java.util.*;

public class limitStream 
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
            .distinct()
            .filter(n->n>50)
            .limit(3)
            .forEach(System.out::println);
    }    
}
