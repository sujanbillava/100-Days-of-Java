import java.util.*;

public class CountingOccurance 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        int count=0;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter the Elements=");
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the Element to Search= ");
        int search=sc.nextInt();
        for(i=0;i<array.length;i++)
        {
            if(search==array[i])
            {
                count=count+1;
                 
            }
            
            
        }
        System.out.println("The Element Occurs"+count+"Times");
    }    
}
