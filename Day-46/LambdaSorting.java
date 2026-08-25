import java.util.*;
class Product
{
    int price;
    int rate;
    String name;
    Product(String name,int price,int rate)
    {
        this.price=price;
        this.rate=rate;
        this.name=name;
    }
    public String toString()
    {
        return name+"-"+price+"-"+rate; 
    }
}

public class LambdaSorting 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Product>list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Product Name");
            String name=sc.nextLine();
            System.out.println("Enter Price");
            int price=sc.nextInt();
            System.out.println("Enter Rating");
            int rate=sc.nextInt();
            sc.nextLine();
            Product obj=new Product(name,price,rate);
            list.add(obj);

        }
        System.out.println(list);
        Collections.sort(list,(s1,s2)->s1.price-s2.price);
        System.out.println(list);
        Collections.sort(list,(s1,s2)->s2.rate-s1.rate);
        System.out.println(list);
        Collections.sort(list,(s1,s2)->s1.name.compareTo(s2.name));
        System.out.println(list);
    }   
}
