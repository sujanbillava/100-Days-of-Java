import java.util.*;

public class EvenandOddSum 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        int evensum=0;
        int oddsum=0;
        for(i=0;i<array.length;i++)
        {
            System.out.println("Enter the Element=");
            array[i]=sc.nextInt();
        }
        for(i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                evensum=evensum+array[i];
            }
            else
            {
                oddsum=oddsum+array[i];
            }
            
        }
        System.out.println("Even Sum="+evensum);
        System.out.println("Odd Sum="+oddsum);
    }    
}
