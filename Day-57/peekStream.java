import java.util.*;

public class peekStream 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Number");
            int num=sc.nextInt();
            list.add(num);
        }   
        System.out.println(list);
        list.stream()
            .filter(n->n>20)
            .peek(n->System.out.println("Checking:"+n))
            .forEach(n->System.out.println("Result:"+n));
            
    }    
}
