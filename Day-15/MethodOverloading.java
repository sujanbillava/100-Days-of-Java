import java.util.*;

public class MethodOverloading 
{
    public static int  add(int a,int b )
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public static double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args) 
    {
        int result=add(2,3);
        int result1=add(3,4,5);
        double result2=add(3.5,6.5);
        System.out.println("Addition of 2 Integer="+result);
        System.out.println("Addition of 3 Integer="+result1);
        System.out.println("Addition of 2 Double="+result2);    
    }
}
