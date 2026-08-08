import java.util.*;

public class string 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println("Length="+(name.length()));
        System.out.println("First Character="+(name.charAt(0)));
        System.out.println("Last Character="+(name.charAt(name.length()-1)));
        System.out.println("UpperCase="+(name.toUpperCase()));
        System.out.println("LowerCase="+(name.toLowerCase()));    
    }    
}
