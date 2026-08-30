import java.util.*;
import java.util.function.*;
class Student implements Comparable<Student>
{
    String name;
    int age;
    int marks;
    Student(String name,int age,int marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public int compareTo(Student other)
    {
        return this.marks-other.marks;
    }
    public String toString()
    {
        return name+"-"+age+"-"+marks;
    }
}
class AgeDecending implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return s2.age-s1.age;
    }
}
public class Revision 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Name");
            String name=sc.nextLine();
            System.out.println("Enter Age");
            int age=sc.nextInt();
            System.out.println("Enter Marks");
            int marks=sc.nextInt();
            sc.nextLine();
            Student obj=new Student(name,age,marks);
            list.add(obj);
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,new AgeDecending());
        System.out.println(list);
        Collections.sort(list,(s1,s2)->s1.name.compareTo(s2.name));
        System.out.println(list);
        for(int i=0;i<5;i++)
        {
            Predicate<Student>eligible=n->n.marks>=45;
            System.out.println(eligible.test(list.get(i)));
            Consumer<Student>n=name->System.out.println(name);
            n.accept(list.get(i));
            Supplier<String>college=()->"GITAM University";
            System.out.println(college.get());
            Function<Student,String>ex=name->"Student="+name;
            System.out.println(ex.apply(list.get(i)));
        }
        list.stream()
            .forEach(System.out::println);
        list.stream()
            .filter(n->n.marks>=50)
            .forEach(System.out::println);
        list.stream()
            .filter(n->n.marks>=50)
            .map(n->n.name)
            .forEach(System.out::println);


    }    
}
