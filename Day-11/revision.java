import java.util.*;

public class revision 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int num=sc.nextInt();
        System.out.println("Choose:\n1.Reverse\n2.Digitcount\n3.Palindrome\n4.Even/odd\n5.All");
        System.out.print("Choose=");
        int choose=sc.nextInt();
        int reverse=0;
        int count=0;
        int origin=num;
        int cou=num;
        int pal=num;
        int eo=num;
        int rev=0;
        int invalid=num;
        int palin=num;
        int print=num;
        switch(choose)
        {
            case 1:
                while(num>0)
                {
                    int digit=num%10;
                    reverse=reverse*10+digit;
                    num=num/10 ;       
                }
                System.out.print("Reverse Number ="+reverse);
                break;
            case 2:
                while(num>0)
                {
                    num=num/10;
                    count=count+1;

                }
                System.out.println("Digit count ="+count);
                break;
            case 3:
                while(num>0)
                {
                    int digit=num%10;
                    reverse=reverse*10+digit;
                    num=num/10;
                }
                if(origin==reverse)
                {
                    System.out.println("Palindrome = Yes");

                }
                else
                {
                    System.out.println("Palindrome = No");
                }
                break;
            case 4:
                if(num%2==0)
                {
                    System.out.println("Even/Odd = Even");
                }
                else
                {
                    System.out.println("Even/Odd = Odd");
                }
                break;
            case 5:
                while(origin>0)
                {
                    int digit=origin%10;
                    reverse=reverse*10+digit;
                    origin=origin/10 ;       
                }
                System.out.println("Reverse Number ="+reverse);
                while(cou>0)
                {
                    cou=cou/10;
                    count=count+1;

                }
                System.out.println("Digit count ="+count);
                while(pal>0)
                {
                    int digit=pal%10;
                    rev=rev*10+digit;
                    pal=pal/10;
                }
                if(palin==rev)
                {
                    System.out.println("Palindrome = Yes");

                }
                else
                {
                    System.out.println("Palindrome = No");
                }
                if(eo%2==0)
                {
                    System.out.println("Even/Odd = Even");
                }
                else
                {
                    System.out.println("Even/Odd = Odd");
                }
                        
        }
        for(int i=1;i<=print;i++)
        {
            System.out.println(i);
        }

        if(invalid<0)
                {
                        System.out.println("Invalid Choose");
                }
        

    }
}
