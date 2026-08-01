import java.util.*;

public class BinarySearch 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array=");
        int size=sc.nextInt();
        int[] array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter a Element=");
            array[i]=sc.nextInt();
        }
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Enter the key you want to find=");
        int key=sc.nextInt();
        int low=0;
        int high=array.length-1;
        int mid;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(key==array[mid])
            {
                System.out.println("Element Found");
                break;
            }
            else if(key>array[mid]) 
            {
                low=mid+1;
            }
            else if(key<array[mid])
            {
                high=mid-1;
                
            }
            
        }
        if(low>high)
        {
           System.out.println("Element Not Found");
        }
    }    
}
