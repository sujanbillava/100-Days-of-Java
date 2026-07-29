import java.io.*;
import java.util.*;
public class calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start Your Calculation");
        System.out.print("Enter the Number=");
        double num1=sc.nextDouble();
        System.out.print("Enter the operators=");
        char operators=sc.next().charAt(0);
        System.out.print("Enter the Number=");
        double num2=sc.nextDouble();
        switch(operators)
        {
            case '+':
                System.out.print("Sum="+(num1+num2));
                break;
                
            case '-':
                System.out.print("Difference="+(num1-num2));
                break;
            case '*':
                System.out.print("Product="+(num1*num2));
                break;
            case '/':
                System.out.println("Quotient="+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder="+(num1%num2));
                break;
            
            default:
                System.out.println("Code Run Sucessful");
        }
    }
}
