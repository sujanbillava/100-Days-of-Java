import java.io.*;
import java.util.*;
public class problem4target 
{
    public static void main(String[] args) 
    {
        int arr[]={2,7,2,8,4,6};
        int target=9;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i);
                    System.out.println(j);
                   
                }
            }
        }    
    }    
}
