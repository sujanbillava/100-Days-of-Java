import java.util.*;

public class Revision 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Array=");
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
        int max=array[0];
        for(i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("Maximum="+max);
        int min=array[0];
        for(i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Minimum="+min);
        int sum=0;
        for(i=0;i<array.length;i++)
        {
            sum=sum+array[i];
        }
        System.out.println("Sum="+sum);
        double average=(double)sum/array.length;
        System.out.println("Average="+average);
        System.out.println("Reverse Array");
        int temp;
        i=0;
        int j=array.length-1;
        while(i<j)
        {
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        
    }    
}
