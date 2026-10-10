import java.io.*;
import java.util.*;
public class problem3 
{
    static void reverse(String name,int index)
    {
        if(index<0)
        {
            return;
        }
        System.out.print(name.charAt(index));
        reverse(name,index-1);
    }  
    public static void main(String[] args) 
        {
            reverse("Java","Java".length()-1);
        }
      
}
