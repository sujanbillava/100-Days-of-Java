import java.io.*;
import java.util.*;
public class hashset
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter a Number=");
            int num=sc.nextInt();
            set.add(num);
        }
        System.out.println(set);
        System.out.println("Unique Number="+set.size());
        System.out.println("Enter the Number to Search");
        int search=sc.nextInt();
        System.out.println(set.contains(search));
        System.out.println("Enter the value to remove");
        int remove=sc.nextInt();
        System.out.println(set.remove(remove));
        System.out.println("Final HashSet="+set);
        for(int x:set)
        {
            System.out.println(x);
        }
    }
}