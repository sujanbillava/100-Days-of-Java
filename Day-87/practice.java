import java.io.*;
import java.util.*;
public class practice 
{
    static void printChar(String name,int index)
    {
        if(index==name.length())
        {
            return;
        }
        System.out.println(name.charAt(index));
        printChar(name,index+1);

    }    
    public static void main(String[]args)
    {
        printChar("JAVA",0);
    }
}
