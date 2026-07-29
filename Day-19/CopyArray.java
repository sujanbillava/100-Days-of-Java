import java.util.*;

public class CopyArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int[] array2;
        array2=new int[array.length];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter the Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Copy Array");
        for(i=0;i<array2.length;i++)
        {
            array2[i]=array[i];
            System.out.println(array2[i]);
        }
        
    }    
}
