import java.util.*;

public class Recursion 
{
    public static void display(int n)
    {
        if(n==0)
        {
            return;
        }
        display(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input of n");
        int n=sc.nextInt();
        Recursion obj1=new Recursion();
        obj1.display(n);    
    }
}
