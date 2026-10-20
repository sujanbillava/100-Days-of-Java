import java.io.*;
import java.util.*;

public class problem2missingnumber
{
    public static void main(String[]args)
    {
        int arr[]={1,2,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum="+sum);
        int sum2=0;
        for(int i=1;i<=5;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("Sum2="+sum2);
        System.out.println("Missing Number");
        int missing=sum2-sum;
        System.out.println(missing);
        
    }
}
