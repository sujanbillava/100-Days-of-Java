import java.util.*;

public class Array 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int[]marks;
        marks=new int[5];
        int i;
        for( i=0;i<5;i++)
        {
            System.out.print("Enter a Number=");
            marks[i]=sc.nextInt();
            
        }
        for(i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        

    }
}
