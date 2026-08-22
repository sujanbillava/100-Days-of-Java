import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    Student(String name)
    {
        this.name=name;
    }
    public int compareTo(Student other)
    {
        return other.name.compareTo(this.name);
    }
    public String toString()
    {
        return name;
    }
}
public class con2decending 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new  ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            Student obj=new Student(name);
            list.add(obj);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }   
}
