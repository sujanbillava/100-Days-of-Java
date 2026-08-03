import java.util.*;

public class SelectionSort 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size=sc.nextInt();
        int[] array=new int[size];
        int i,j,temp;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter a Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Sorted Array");
        for(i=0;i<array.length-1;i++)
        {
            int minindex=i;
            for(j=i+1;j<array.length;j++)
            {
                if(array[j]<array[minindex])
                {
                    minindex=j;
                }
            }
            temp=array[i];
            array[i]=array[minindex];
            array[minindex]=temp;

        }
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }    
}
