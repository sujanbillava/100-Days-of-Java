import java.util.*;
public class Linear 
{
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of Students=");
            int student=sc.nextInt();
            int[] rollno;
            rollno=new int[student];
            int i;
            for(i=0;i<rollno.length;i++)
            {
                System.out.println("Enter the RollNo=");
                rollno[i]=sc.nextInt();
            }
            System.out.println("Find RollNo You Want=");
            int find=sc.nextInt();
            boolean found=false;
            for(i=0;i<rollno.length;i++)
            {
                if(find==rollno[i])
                {
                    found=true;
                    System.out.println("RollNo is Found at Position"+i);
                }
            }
            if(found)
            {
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }

        }
    }
}
