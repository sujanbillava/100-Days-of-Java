import java.util.*;
public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        int j;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter the Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Reverse Array");
        i=0;
        j=array.length-1;
        int temp;
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
