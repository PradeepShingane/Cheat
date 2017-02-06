import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
public static void  main(String [] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
int sum=0;
	
	ArrayList<Integer> l=new ArrayList<Integer>();
	//System.out.println("Enter the top 5 scorers of IPL Season 8");
	for (int i = 0; i < n; i++) {
		l.add(sc.nextInt());
	}
	for (int i = 0; i < l.size(); i++) {
		if((i%2==0 && l.get(i)%2==0 ) ||(i%2!=0 && l.get(i)%2!=0)) 
		sum=sum+l.get(i);
	}
	System.out.println(sum);
}
}