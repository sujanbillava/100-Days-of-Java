import java.io.*;
import java.util.*;
class Box<T>
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
public class generics 
{
    public static void main(String[]args)
    {
        Box<String> a=new Box<>();
        a.set("Sujan");
        Box<Integer>b=new Box<>();
        b.set(100);
        System.out.println(a.get());
        System.out.println(b.get());
    }
}
