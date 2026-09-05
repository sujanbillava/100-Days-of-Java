import java.util.*;

public class Stream 
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
        long count=list.stream()
                        .distinct()
                        .count();
        boolean result=list.stream()
                            .anyMatch(n->n>100);
    
        boolean result1=list.stream()
                            .allMatch(n->n>0);

        boolean result3=list.stream()
                            .noneMatch(n->n<0);
        System.out.println("Number of Element="+count);
        System.out.println("Any Match="+result);
        System.out.println("All Match="+result1);
        System.out.println("None Match="+result3);

    }    
}
