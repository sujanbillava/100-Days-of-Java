import java.util.*;
public class stringbuilder
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Words");
        String name=sc.nextLine();

        StringBuilder sb=new StringBuilder(name); 
        sb.append(" Java");
        System.out.println(sb);

        sb.insert(5," I Love");
        System.out.println(sb);

        sb.setCharAt(0,'Y');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String result=sb.toString();
        System.out.println(result);
        
        System.out.println(result.length());

    }
}