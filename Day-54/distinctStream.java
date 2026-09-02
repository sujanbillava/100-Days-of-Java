import java.util.*;
public class distinctStream
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int  i=0;i<10;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);

        }    
        System.out.println(list);
        list.stream()
            .distinct()
            .filter(n->n>20)
            .forEach(System.out::println);
    }
}
