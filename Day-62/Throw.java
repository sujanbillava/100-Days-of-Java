import java.util.*;

public class Throw 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();
        try{
            if(age<18)
        {
            throw new Exception("Not Eligible");
        }
        System.out.println("Eligible");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Compiled");
        }
        
    }    
}
