import java.util.*;


public class SmartCalculator 
{
    public static int calculate(int a,int b)
    {
        return a+b;
    }    
    public static int calculate(int a,int b,int c)
    {
        return a*b*c;
    } 
    public static double calculate(double a,double b)
    {
        return (a+b)/2;
    }
    public static double calculate(int a,double b)
    {
        return Math.pow(a,b);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("====== SMART CALCULATOR ======");
        System.out.println("1. Add Two Integers");
        System.out.println("2. Multiply Three Integers");
        System.out.println("3. Average of Two Doubles");
        System.out.println("4. Power (int,double)");
        System.out.println("5. Exit");
        System.out.print("Enter your choice=");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter First value=");
                int a=sc.nextInt();
                System.out.print("Enter Second value=");
                int b=sc.nextInt();
                int result=calculate(a,b);
                System.out.println("Sum="+result);
                break;
            case 2:
                System.out.print("Enter First value=");
                int a1=sc.nextInt();
                System.out.print("Enter Second value=");
                int b1=sc.nextInt();
                System.out.print("Enter Third value=");
                int c=sc.nextInt();
                int result1=calculate(a1,b1,c);
                System.out.print("Sum="+result1);
                break;
            
            case 3:
                System.out.print("Enter First value=");
                double a2=sc.nextDouble();
                System.out.print("Enter Second value=");
                double b2=sc.nextDouble();
                double result2=calculate(a2,b2);
                System.out.print("Sum="+result2);
                break;
            case 4:
                System.out.print("Enter First value=");
                int a3=sc.nextInt();
                System.out.print("Enter Second value=");
                double b3=sc.nextDouble();
                double result3=calculate(a3,b3);
                System.out.print("Sum="+result3);
                break;
            case 5:
                System.out.println("Exit");
            default:
                System.out.println("Invalid Choice");

        }
                       
    }

}
