import java.io.*;
import java.util.*;
public class problem2 
{
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        factorial(n-1);
        return n*factorial(n-1);
    }  
    public static void main(String[] args) 
    {
        System.out.println(factorial(5));    
    }
}
