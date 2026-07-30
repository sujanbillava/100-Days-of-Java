import java.util.*;

public class MinimumElementInArray 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
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
        int min=array[0];
        for(i=0;i<array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Minimum Value="+min);
    }    
}
