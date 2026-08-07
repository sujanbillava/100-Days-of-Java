import java.util.*;

public class QuickSort 
{
    public static void quicksort(int[]array,int low,int high)
    {
        if(low>=high)
        {
            return ;
        }
        int pivotIndex=partition(array,low,high);
        quicksort(array,low,pivotIndex-1);
        quicksort(array,pivotIndex+1,high);
    }
    public static int partition(int[]array,int low,int high)
    {
        int i=low-1;
        int j=low;
        int temp;
        int pivot=array[high];
        while(j<high)
        {
            if(array[j]<=pivot)
            {
                i++;
                temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
            j++;
        }
        temp=array[high];
        array[high]=array[i+1];
        array[i+1]=temp;
        return  i+1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of Array");
        int size=sc.nextInt();
        int[]array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.println("Enter a Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        quicksort(array,0,array.length-1);
        System.out.println("Quick Sorted");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }    
}
