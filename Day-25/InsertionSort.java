import java.util.*;

public class InsertionSort 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int[]array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter a Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Sorted Array");
        int key;
        int j;
        for(i=1;i<array.length;i++)
        {
            key=array[i];
            j=i-1;
            while(j>=0 && array[j]>key)
            {
                array[j+1]=array[j];
                j--;
                
            }
            array[j+1]=key;
        }
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
