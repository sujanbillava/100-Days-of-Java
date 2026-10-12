import java.io.*;
import java.util.*;
public class BactrackingPractice 
{
    static void subset(String str,int index,String result)
    {
        if(index==str.length())
        {
            System.out.println(result);
            return;
        }
        subset(str,index+1,result);
        subset(str,index+1,result+str.charAt(index));
        
    }    
    public static void main(String[] args) 
        {
            subset("ABC",0,"");
        }
    
}
