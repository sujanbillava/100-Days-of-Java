import java.util.*;

public class linkedhashmap 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Student ID");
            int sid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name");
            String sname=sc.nextLine();
            map.put(sid,sname);
        }
        System.out.println(map);
        System.out.println("Enter Student ID=");
        int search=sc.nextInt();
        System.out.println(map.get(search));
        System.out.println("Enter the ID to search it contains");
        int contain=sc.nextInt();
        System.out.println(map.containsKey(contain));
        System.out.println("Enter the ID  to remove");
        int remove=sc.nextInt();
        map.remove(remove);
        System.out.println(map);
        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }    
}
