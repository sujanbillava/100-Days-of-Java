import java.util.*;

public class AverageOfArray 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
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
        double sum=0;
        double average;
        for(i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        average=sum / array.length;
        System.out.println("Sum="+sum);
        System.out.println("Average="+average);
    }    
}
