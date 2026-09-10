import java.io.*;
import java.util.*;
public class practice 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance");
        int bal=sc.nextInt();
        System.out.println("Enter Withdraw");
        int wit=sc.nextInt();
        try{
            withdrawal(bal,wit);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }    
    public static void withdrawal(int bal,int wit)throws Exception
    {
        try{
            if(wit>bal)
            {
                throw new Exception("Insufficient Balance");
            }
            else{
                System.out.println("Withdraw Sucessful");
            }
        }
        finally{
            System.out.println("Transaction completed");
        }
    }
}
