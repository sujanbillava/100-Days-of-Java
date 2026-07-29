import java.util.*;
public class MaximumElementInArray 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter the Element");
            array[i]=sc.nextInt();
        }
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
        System.out.println("Largest Element="+max);
        

    }
}
