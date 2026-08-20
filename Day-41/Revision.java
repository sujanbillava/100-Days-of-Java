import java.util.*;

public class Revision 
{
    public static void main(String[] args) 
    {
        
    
    Scanner sc=new Scanner(System.in);
    ArrayList<String> list=new ArrayList<>();
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Patient Name");
        String name=sc.nextLine();
        list.add(name);
    }
    HashSet<String> set=new HashSet<>();
    for( int i=0;i<5;i++)
    {
        System.out.println("Patient medical Department");
        String department=sc.nextLine();
        set.add(department);
    }
    HashMap<Integer,String> map=new HashMap<>();
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Patient ID ");
        int id=sc.nextInt();
        map.put(id,list.get(i));
        
    }
    TreeSet<Integer> set1=new TreeSet<>();
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Patient Age");
        int age=sc.nextInt();
        set1.add(age);
    }
    LinkedHashSet<String> link=new LinkedHashSet<>();
    sc.nextLine();
    for(int i=0;i<5;i++)
    {
        System.out.println("enter Patient Symptoms");
        String symptoms=sc.nextLine();
        link.add(symptoms);
    }
    LinkedHashMap<Integer,String> hash=new LinkedHashMap<>();
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter the Token Number");
        int token=sc.nextInt();
        hash.put(token,list.get(i));
        
    }
    sc.nextLine();
    ArrayDeque<String> deque=new ArrayDeque<>();
    for(String value:list)
    {
        deque.add(value);
        
    }
    System.out.println(deque.peekFirst());
    System.out.println(deque.peekLast());
    PriorityQueue<Integer> prior=new PriorityQueue<>();
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter Priority Number");
        int num=sc.nextInt();
        prior.add(num);
    }
    sc.nextLine();
    System.out.println(prior.peek());
    System.out.println("Enter Patient Name To Remove");
    String remove=sc.nextLine();
    Iterator<String> it=list.iterator();
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
