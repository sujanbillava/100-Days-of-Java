import java.io.*;
import java.util.*;

public class arraylist 
{
    public static void main(String[]args)
    {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(20);
        num.add(45);
        num.add(80);
        System.out.println(num);
        System.out.println(num.get(2));
        num.set(1,35);
        num.remove(3);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.contains(80));
    }    
}
