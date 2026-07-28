import java.util.*;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.println("Enter the Element=");
            array[i]=sc.nextInt();
        }
        for(i=0;i<array.length;i++)
        {
            System.out.println("Original Value\n"+array[i]);
        }
        for(i=array.length-1;i>=0;i--)
        {
            System.out.println("Reverse Value\n"+array[i]);
        }
    }    
}
