import java.util.*;
class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return name+"-"+age;
    }
}
class AgeComparators implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        if(s1.age==s2.age)
        {
            return s1.name.compareTo(s2.name);
        }
        return s1.age-s2.age;
    }
}
public class comparwithCondition 
{
   public static void main(String[]args)
   {
     Scanner sc=new Scanner(System.in);
     ArrayList<Student>list=new ArrayList<>();
     for(int i=0;i<5;i++)
    {
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        sc.nextLine();
        Student obj=new Student(name,age);
        list.add(obj);
    }
    System.out.println(list);
    Collections.sort(list,new AgeComparators());
    System.out.println(list);
   } 
}
