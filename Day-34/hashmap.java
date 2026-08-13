import java.util.*;
public class hashmap
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the student ID=");
            int id=sc.nextInt();
            System.out.println("Enter his CGPA=");
            Integer cgpa=sc.nextInt();
            map.put(id,cgpa);

        }
        System.out.println(map);
        System.out.println("Enter Student ID=");
        int sid=sc.nextInt();
        System.out.println(map.get(sid));
        System.out.println("Enter the ID if that Exists");
        int eid=sc.nextInt();
        System.out.println(map.containsKey(eid));
         int max=0;
        for(Integer value:map.values())
        {
            if(value>max)
            {
                max=value;
            }
        }
        System.out.println("Heighest CGPA="+max);
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}