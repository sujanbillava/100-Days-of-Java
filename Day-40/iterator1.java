import java.util.*;

public class iterator1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter a Name");
            String name=sc.nextLine();
            list.add(name);
        }
        Iterator<String> it=list.iterator();;
        System.out.println("Enter the Name to remove");
        String remove=sc.nextLine();
        while(it.hasNext())
        {
            String value=it.next();
            if(value.equals(remove))
            {
                it.remove();
            }
        
        }
        System.out.println(list);

    }    
}
