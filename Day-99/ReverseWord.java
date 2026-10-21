import java.io.*;
import java.util.*;
    public class ReverseWord 
    {
        public static void main(String[] args) 
        {
            String word="Hi Java,nice to meet you";
            String[] reverse=word.split(" ");
            for(int i=0;i<reverse.length;i++)
                {
                    for(int j=reverse[i].length()-1;j>=0;j--)
                    {
                        System.out.print(reverse[i].charAt(j));
                    }
                    System.out.println(" ");
                }    
        }    
    }
