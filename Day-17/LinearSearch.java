import java.util.*;

public class LinearSearch 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size=");
        int num=sc.nextInt();
        int[] student;
        student=new int[num];
        int i;
        for( i=0;i<student.length;i++)
        {
            System.out.println("Enter the elements");
            student[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be Search=");
        int search=sc.nextInt();
        boolean found=false;
        for(i=0;i<student.length;i++)
        {
            if(student[i]==search)
            {
                found=true;
                System.out.println("Found at index"+i);
                break;
            }
            
        }
        if(found)
        {
            System.out.println("Found ");
        }
        else
        {
            System.out.println("Not Found");
        }
        
    }    
}
