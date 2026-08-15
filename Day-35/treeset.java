import java.util.*;

public class treeset 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> numbers=new TreeSet<>();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter a Number=");
            int num=sc.nextInt();
            numbers.add(num);
        }
        System.out.println(numbers);
        System.out.println("Smallest Number="+numbers.first());
        System.out.println("Largest Number="+numbers.last());
        System.out.println("Enter a Number=");
        int x=sc.nextInt();
        System.out.println("Lower of x="+numbers.lower(x));
        System.out.println("Higher of x="+numbers.higher(x));
        System.out.println("floor of x="+numbers.floor(x));
        System.out.println("Ceiling of x="+numbers.ceiling(x));
        System.out.println("Enter a number to search=");
        int search=sc.nextInt();
        System.out.println("Searching Element="+numbers.contains(search));
    }    
}
