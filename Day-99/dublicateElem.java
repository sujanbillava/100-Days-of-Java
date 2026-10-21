import java.io.*;
import java.util.*;
public class dublicateElem 
{
    public static void main(String[] args) 
    {
            int arr[]={7,2,5,3,2,4,5};
            boolean found=false;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        if(i>j)
                        {
                            found=true;
                            break;
                        }
                    }
                }
                if(found==true)
                {
                        System.out.println(arr[i]);
                        break;
                }
            }
            
    }    
}
