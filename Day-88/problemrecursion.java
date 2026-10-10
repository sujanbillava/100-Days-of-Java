import java.io.*;
import java.util.*;
public class problemrecursion 
{
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        sum(n-1);
        
        return n+sum(n-1);
    } 
    public static void main(String[] args)
        {
           
            System.out.println(sum(5));
        }
      
}
