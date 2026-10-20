import java.io.*;
import java.util.*;
public class problem5sorting 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++)   
        {
            if(arr[i]>arr[i+1])
            {
                sorted=false;
                System.out.println("Element Not Sorted");
                break;
            }  
        } 
        if(sorted)
            {
                System.out.println("Element sorted");
            }
            else{
                
            }
        
        
    }    
}
