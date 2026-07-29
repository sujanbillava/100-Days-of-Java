import java.util.*;

public class ArrayEqual 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array1=");
        int size=sc.nextInt();
        int[] array;
        array=new int[size];
        System.out.println("Enter the Size of Array2=");
        int size2=sc.nextInt();
        int[] array2;
        array2=new int[size2];
        int i;
        boolean equal=true;
        for(i=0;i<array.length;i++)
        {
            System.out.println("Enter the Element1=");
            array[i]=sc.nextInt();
        }
        for(i=0;i<array2.length;i++)
        {
            System.out.println("Enter the Element2");
            array2[i]=sc.nextInt();
        }
        System.out.println("Array1");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Array2");
        for(i=0;i<array2.length;i++)
        {
            System.out.println(array2[i]);
        }
        if(array.length!=array2.length)
        {
            equal=false;
            
        }
        else
        {
            for(i=0;i<array.length;i++)
            {
                if(array[i]!=array2[i])
                {
                    equal=false;
                
                }
            }
        }
            
        
        if(equal)
        {
            System.out.println("Array Are Equal");
        }
        else
        {
            System.out.println("Array Are Not Equal");
        }
    }
}
