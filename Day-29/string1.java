import java.util.*;

public class string1 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Anything");
        String name=sc.nextLine();
        String name1="I Love java";
        System.out.println("Length="+(name.length()));
        System.out.println("First Character="+(name.charAt(0)));
        System.out.println("Last Character="+(name.charAt(name.length()-1)));
        System.out.println("Uppercase="+(name.toUpperCase()));
        System.out.println("Contains Java="+(name.contains("Java")));
        System.out.println("Equal ="+(name.equalsIgnoreCase(name1)));

    }    
}
