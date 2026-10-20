    import java.io.*;
    import java.util.*;
    public class DSAproblem1 
    {
        public static void main(String[] args) 
        {
            int[]arr={12,10,25,23,50,40};
            for(int i=0;i<arr.length;i++)
                {
                    System.out.println(arr[i]);
                } 
            int secondlargest;
            int largest;
            if(arr[0]>arr[1])
            {
                secondlargest=arr[1];
                largest=arr[0];

            }
            else
            {
                largest=arr[1];
                secondlargest=arr[0];
            }
            for(int i=2;i<arr.length;i++)
            {
                if(arr[i]>largest)
                {
                    secondlargest=largest;
                    largest=arr[i];
                }
                else if(arr[i]<largest&&arr[i]>secondlargest)
                {
                    secondlargest=arr[i];
                    
                }  
            }
            System.out.println(secondlargest);
        }    
    }
