import java.util.*;

public class SumOfElementInArray 
{
    public static void main(String[] args) 
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
        System.out.println("Originl Array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        int sum=0;
        for(i=0;i<array.length;i++)
        {
            sum=sum+array[i];

        }
        System.out.println("Sum of Element="+sum);
    }    
}
