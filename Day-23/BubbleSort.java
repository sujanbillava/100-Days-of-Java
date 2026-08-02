import java.util.*;
public class BubbleSort
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
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
            for(j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}