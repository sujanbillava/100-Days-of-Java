import java.util.*;

public class arraylist1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        num.add(80);
        for(int value:num)
        {
            System.out.println(value);
        }
        int sum=0;
        for(int value:num)
        {
             sum=sum+value;
            
        }
        System.out.println(sum);
        int highest=0;
        for(int value:num)
        {
            if(highest<value)
            {
                highest=value;
            }
            
        }
        System.out.println("Highest="+highest);
        int lowest=num.get(0);
        for(int value:num)
        {
            if(lowest>value)
            {
                lowest=value;

            }
        }
        System.out.println("Lowest=="+lowest);
        double average=(double)sum/num.size();
        System.out.println("Average="+average);
        System.out.println("Enter the Element to Search=");
        int con=sc.nextInt();
        System.out.println(num.contains(con));
        for(int i=0;i<num.size();i++)
        {
            System.out.println(num.get(i));
        }
    }    
}
