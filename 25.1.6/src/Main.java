import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{
public static void main(String a[]){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number of best bowlers in season 4");
      int n=in.nextInt();
      in.nextLine();
HashSet<String> a1=new HashSet<String>();
System.out.println("Enter the name of players");
for(int i=0;i<n;i++)
{
      a1.add(in.nextLine());
}
System.out.println("Enter the number of best bowlers in season 5");
int m=in.nextInt();
in.nextLine();
HashSet<String> a2=new HashSet<String>();
System.out.println("Enter the name of players");
for(int i=0;i<m;i++)
{
      a2.add(in.nextLine());
}
Iterator i1;
i1=a1.iterator();
System.out.println("Player Set 1");
while(i1.hasNext())
{
      System.out.println(i1.next());
}
Iterator i2;
i2=a2.iterator();
System.out.println("Player Set 2");
while(i2.hasNext())
{
      System.out.println(i2.next());
}
System.out.println("Difference");
a1.removeAll(a2);
i1=a1.iterator();
while(i1.hasNext())
{
      System.out.println(i1.next());
}
}
}
