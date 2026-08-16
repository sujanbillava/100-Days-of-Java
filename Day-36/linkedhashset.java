import java.util.*;

public class linkedhashset 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<String> topics=new LinkedHashSet<>();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter the Topics");
            String recent=sc.nextLine();
            topics.add(recent);
        }
        System.out.println(topics);
        System.out.println("Number of Unique Topics="+topics.size());
        System.out.println("Enter the topic to Search=");
        String  search=sc.nextLine();
        System.out.println("Topic="+topics.contains(search));
        System.out.println("Remove ay one Topic");
        String removetopic=sc.nextLine();
        topics.remove(removetopic);
        System.out.println(topics);
        for(String val:topics)
        {
            System.out.println(val);
        }
    }    
}
