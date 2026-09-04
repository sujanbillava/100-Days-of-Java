import java.util.*;

public class javac 
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
        boolean result=list.stream()
                            .anyMatch(n->n>100);
        System.out.println(result);
    }    
}
