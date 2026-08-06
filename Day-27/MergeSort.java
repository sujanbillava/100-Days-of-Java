import java.util.*;

public class MergeSort 
{
    public static void mergesort(int[]array,int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        int mid=left+(right-left)/2;
        mergesort(array, left,mid);
        mergesort(array,mid+1,right);
        merge(array,left,mid,right);
        
    }
    public static void merge(int[]array,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int i=0;
        int j=0;
        int k=left;
        int[]L=new int[n1];
        for(i=0;i<L.length;i++)
        {
            L[i]=array[left+i];
        }
        int[]R=new int[n2];
        for(i=0;i<R.length;i++)
        {
            R[i]=array[mid+1+i];
        }
        i=0;
        j=0;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                array[k]=L[i];
                i++;
            }
            else
            {
                array[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            array[k]=L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            array[k]=R[j];
            j++;
            k++;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array=");
        int size=sc.nextInt();
        int[]array=new int[size];
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.print("Enter a Element=");
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array");
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("Merge Sorted");
        mergesort(array,0,array.length-1);
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        
    }
}
