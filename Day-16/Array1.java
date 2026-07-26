import java.util.*;

public class Array1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Students=");
        int num=sc.nextInt();
        int[]mark;
        mark=new int[num];
        int i;
        
        double total=0;
        double average= 0;
        for(i=0;i<mark.length;i++)
        {
            System.out.print("Enter a marks=");
            mark[i]=sc.nextInt();
        }
        System.out.println("===============REPORT================");
        for(i=0;i<mark.length;i++)
        {
            System.out.println(mark[i]);
        }
        int highest=mark[0];
        int lowest=mark[0];
        for(i=0;i<mark.length;i++)
        {
            if(mark[i]>highest)
            {
               highest=mark[i];
            }
        }
         System.out.println("Hegihest="+highest);
         
        for(i=0;i<mark.length;i++)
        {
            if(mark[i]<lowest)
            {
                lowest=mark[i];
            }
            
        }
        System.out.println("Lowest="+lowest);
        for(i=0;i<mark.length;i++)
        {
            total=total+mark[i];
            
        }
        System.out.println("Total="+total);
        for(i=0;i<mark.length;i++)
        {
            average=(total)/mark.length;
            
        }
        System.out.println("Average="+average);

    }
}
