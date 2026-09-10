import java.io.*;
import java.util.*;

public class finalExceptional 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 Number");
        int num1=sc.nextInt();
        System.out.println("Enter 2 Number");
        int num2=sc.nextInt();
        try{
            int result=num1/num2;
            System.out.println("Result="+result);
        }
        catch(ArithmeticException e){
            System.out.println("Not Divisible by Zero");
        }
        finally{
            System.out.println("Calculation Completed");
        }
    }    
}
