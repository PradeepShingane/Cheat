import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
public static void  main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String a = null;
	ArrayList<String> l=new ArrayList<String>();
	//System.out.println("Enter the top 5 scorers of IPL Season 8");
	for (int i = 0; i < n; i++) {
		l.add(sc.nextLine());
	}
	do
	{
	System.out.println("Menu\n1.Insert Players\n2.Delete Players");
	int choice=sc.nextInt();
	sc.nextLine();
	switch(choice)
	{
	case 1:
		l.add(sc.nextLine());
		System.out.println("Player details after insertion");
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
			System.out.println("Do you want to continue");
			 a=sc.nextLine();
			break;
	   case 2:
		   l.remove(sc.nextLine());
		  // sc.nextLine();
		   System.out.println("Player details after deletion");
		   for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		   System.out.println("Do you want to continue");
		   a=sc.nextLine();
		   break;
		}
	}while(a.equalsIgnoreCase("yes") );
}
}
		
	


