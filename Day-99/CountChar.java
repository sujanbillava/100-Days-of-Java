import java.io.*;
import java.util.*;
public class CountChar 
{
    public static void main(String[] args) 
    {
        String name="Java";
        
        for(int i=0;i<name.length();i++)
        {
                int count=0;
                for(int j=0;j<name.length();j++)
                {
                    if(name.charAt(i)==name.charAt(j))
                    {
                        count=count+1;
                    }
                }
                boolean repeat=false;
                for(int j=0;j<i;j++)
                {
                    if(name.charAt(i)==name.charAt(j))
                    {
                        repeat=true;
                    }
                }
                if(!repeat)
                {
                    System.out.println(name.charAt(i)+"="+count);
                }
                
            }   
    }    
}
