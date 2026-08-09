import java.util.*;

public class Example 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Words");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        sb.append(" Java");
        System.out.println(sb);
        
        sb.insert(0,"I Love ");
        System.out.println(sb);

        sb.setCharAt(2,'x');
        System.out.println(sb);

        sb.delete(7,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String result=sb.toString();
        System.out.println(result);
        System.out.println(result.length());
    }
}
