import java.io.*;
import java.util.*;
class Data<T>
{
    T value;
    void set(T value)
    {
        this.value=value;
    }
    T get()
    {
        return value;
    }
}
public class practice 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Phone Number");
        long number=sc.nextLong();
        System.out.println("Enter CGPA");
        double cgpa=sc.nextDouble();

        Data<String>a=new Data<>();
        a.set(name);
        Data<Long>b=new Data<>();
        b.set(number);
        Data<Double>c=new Data<>();
        c.set(cgpa);

        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
        
    }
    
}
