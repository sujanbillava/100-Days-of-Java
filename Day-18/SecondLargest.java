import java.util.*;

public class SecondLargest 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        
        for(i=0;i<array.length;i++)
        {
            System.out.println("Enter the Elements=");
            array[i]=sc.nextInt();
        }
        System.out.println(array.length);
        int Largest=array[0];
        int SecondLargest=Largest;
        for(i=0;i<array.length;i++)
        {
            if(array[i]>Largest)
            {
                
                SecondLargest=Largest;
                Largest=array[i];
            }
            else if(array[i]>SecondLargest)
            {
                SecondLargest=array[i];
            }
            System.out.println("Largest="+Largest);
            System.out.println("Second Largest="+SecondLargest);

        }
        
    }
        
}
