import java.io.*;
import java.util.*;
public class Anagram 
{
    public static void main(String[] args) 
    {
        String a="listen";
        String b="sileat";
        if(a.length()==b.length())
            {
                char[] arr1=a.toCharArray();
                char[] arr2=b.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if(Arrays.equals(arr1,arr2))
                {
                     System.out.println(" Anagram");
                }
                else{
                     System.out.println("Not  Anagram");
                }
                     
            } 
            else{
                System.out.println("Not Anagram");
            }  
    }    
}
