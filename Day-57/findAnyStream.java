import java.util.*;

public class  findAnyStream
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
        int result=list.stream()
                        .filter(n->n<20)
                        .findAny()
                        .orElse(-1);
        System.out.println(result);
    }    
}
