import java.io.*;
import java.util.*;
public class problem2 
{
    static void permutation(String str,String result)
    {
        if(str.isEmpty())
        {
            System.out.println(result);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String remaining=str.substring(0,i)+str.substring(i+1);
            permutation(remaining, result+ch);
            
        }
    }    
    public static void main(String[] args) 
    {
        permutation("ABC","");    
    }
}
