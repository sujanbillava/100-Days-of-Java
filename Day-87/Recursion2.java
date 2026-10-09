import java.io.*;
import java.util.*;
public class Recursion2 
{
    static void printlist(int[]arr,int index)
    {
        if(index==arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        printlist(arr,index+1);
    }
    public static void main(String[] args) 
    {
        int[]arr={10,20,30,40,50};
        printlist(arr,0);
    }    
}
