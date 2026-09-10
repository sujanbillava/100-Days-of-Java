import java.util.*;

public class Throws 
{
    public static void checkAge(int age)throws Exception
    {
        try{
            if(age<18)
            {
                throw new Exception("Not Eligible");
            }
            System.out.println("Eligible");
        }
        finally{
            System.out.println("Compiled");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }    
}
