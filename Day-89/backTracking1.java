import java.io.*;
import java.util.*;
public class backTracking1 
{
    static void generate(String result,int n)
    {
        if(result.length()==n)
        {
            System.out.println(result);
            return;
        }
        generate(result+"0",n);
        generate(result+"1",n);
    }
    public static void main(String[] args) 
    {
        generate("",3);
    }
}
