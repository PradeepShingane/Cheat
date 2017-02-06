import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
public static void  main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
int sum=0;
	int h=0,f=0;
	ArrayList<Integer> l=new ArrayList<Integer>();
	//System.out.println("Enter the top 5 scorers of IPL Season 8");
	for (int i = 0; i < n; i++) {
		l.add(sc.nextInt());
	}
	
  for(int i=0;i<l.size();i++)
  {
	  if(l.get(i)>=100 )
		  
	  {
		  h++;
	  }
	  if(l.get(i)>=50 && l.get(i)<=99)
	  {
		  f++;
	  }
  }
  System.out.println(f+"\n"+h);
}
}
