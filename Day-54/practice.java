import java.util.*;

public class practice 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a Name");
            String name=sc.nextLine();
            list.add(name);
        }
        System.out.println(list);
        list.stream()
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }    
}
