import java.util.*;

public class countStream 
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
        long count=list.stream()
                        .filter(n->n>50)
                        .count();
        System.out.println(count);
    }    
}
