import java.io.*;
import java.util.*;
public class firstNonRepeatingchar 
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
            if(count==1)
                {
                    System.out.println(name.charAt(i));
                    break;
                }   
        }   
    }   
}
