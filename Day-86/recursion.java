import java.io.*;
import java.util.*;

public class recursion 
{
    static void run(int n)
    {
        if(n==0)
        {
            return;
        }
        run(n-1);
        System.out.println(n);
    }
    public static void main(String[]args)
    {   run(5);
    }    
}
