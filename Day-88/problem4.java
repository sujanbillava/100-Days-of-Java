import java.io.*;
import java.util.*;
public class problem4 
{
    static int sumdigit(int n)
    {
        if(n==0)
        {
            return 0;
        }
        sumdigit(n/10);
        
        return (n%10+sumdigit(n/10));
    }   
    public static void main(String[] args) 
    {
        System.out.println(sumdigit(123));    
    } 
}
