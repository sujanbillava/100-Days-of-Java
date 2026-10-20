import java.io.*;
import java.util.*;
public class problem3 
{
    public static void main(String[] args) 
    {
        int arr[]={0,1,2,0,3,0,5,0};
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index=index+1;
            }
        }
        for(int i=index;i<arr.length;i++)
        {
                arr[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
         
            System.out.println(arr[i]);
        }
            
    }   
}
