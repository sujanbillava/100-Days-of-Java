import java.util.*;

public class treeset 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> number=new TreeSet<>();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter a Number=");
            int num=sc.nextInt();
            number.add(num);
        }
        System.out.println(number);
        System.out.println("Smallest Number="+number.first());
        System.out.println("Largest Number="+number.last());
        System.out.println("Enter a Number=");
        int x=sc.nextInt();
        System.out.println("Lower of x="+number.lower(x));
        System.out.println("Higher of x="+number.higher(x));
        System.out.println("floor of x="+number.floor(x));
        System.out.println("Ceiling of x="+number.ceiling(x));
        System.out.println("Enter a number to search=");
        int search=sc.nextInt();
        System.out.println("Searching Element="+number.contains(search));
    }    
}
