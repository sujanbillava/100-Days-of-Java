import java.io.*;
import java.util.*;

public class ExceptionalHandling 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num1=sc.nextInt();
        System.out.println("Enter Number");
        int num2=sc.nextInt();
        try{
            int result=num1/num2;
            System.out.println("Result="+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divisible by Zero");
        }    
    }    
}
